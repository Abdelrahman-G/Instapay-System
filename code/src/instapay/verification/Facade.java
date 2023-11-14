package instapay.verification;

import instapay.user.User;
import instapay.user.UsersDatabase;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Facade {
    UsersDatabase database = new UsersDatabase();

    public Map.Entry<Integer,UserVerification> accountChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add Bank instapay.Account\n2.Add EWallet");
        int choice = input.nextInt();


        while (choice != 1 && choice != 2) {
            System.out.println("Invalid Choice!!");
            System.out.println("1.Add Bank instapay.Account\n2.Add EWallet");
            choice = input.nextInt();

        }
        UserVerification verification = null;
        switch (choice) {
            case 1 -> {
                verification = new BankUserVerification();
                Map.Entry<Integer, UserVerification> entry = Map.entry(choice, verification);
                return entry;
            }
            case 2 -> {
                verification = new EWalletUserVerification();
                Map.Entry<Integer, UserVerification> entry = Map.entry(choice, verification);
                return entry;
            }
        }
        return null;
    }

    public void createUser() throws IOException {

        String username, password, phone_number, email, instapayHandle;
        Facade authService = new Facade();
        Map.Entry<Integer,UserVerification> entry = authService.accountChoice();
        UserVerification verification = entry.getValue();
        int choice = entry.getKey();

        //the process of verifying each user attribute
        username = verification.confirmUsername(database);
        password = verification.confirmPassword();
        phone_number = verification.confirmPhone(database);
        verification.verifyOTP(phone_number);
        instapayHandle = verification.confirmHandle(database);
        User user = verification.makeUserType(choice);
        database.addUser(user);
        user.printUser();
    }

    public void login() {

    }
}

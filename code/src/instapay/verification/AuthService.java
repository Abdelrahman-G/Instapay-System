package instapay.verification;

import instapay.account.Account;
import instapay.account.BankAccount;
import instapay.account.WalletAccount;
import instapay.user.UsersDatabase;

import java.io.IOException;
import java.util.Scanner;
import instapay.user.*;

public class AuthService {
    UsersDatabase database = new UsersDatabase();
    public void createUser() throws IOException {

        String username, password, phone_number, email,instapayHandle;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add Bank Account\n2.Add EWallet");
        int choice = input.nextInt();
        while(choice!=1 && choice!=2){
            System.out.println("Invalid Choice!!");
            System.out.println("1.Add Bank Account\n2.Add EWallet");
            choice = input.nextInt();

        }
        UserVerification verification = null;
        switch (choice) {
            case 1 -> {
                verification = new BankUserVerification();
            }
            case 2 -> {
                verification = new EWalletUserVerification();
            }
        }
        //the process of verifying each user attribute
        username = verification.confirmUsername(database);
        password =verification.confirmPassword();
        phone_number = verification.confirmPhone(database);
        verification.verifyOTP(phone_number);
        instapayHandle = verification.confirmHandle(database);


        User user = null;
        switch (choice) {
            case 1 -> {
                System.out.println("Enter Bank Account Number: ");
                String bankAccountNumber = verification.validateSerial();
                Account account = new BankAccount(bankAccountNumber);
                user = new BankUser(phone_number, username, password, instapayHandle);
            }
            // bank account verification
            // check with api
            case 2 -> {
                System.out.println("Enter EWallet Number: ");
                String EWallet = input.next();
                user = new EWalletUser(phone_number, username, password, instapayHandle);
            }
            // ewallet verification
            //check with api
        }
        database.addUser(user);
        user.printUser();
    }

    public void login(){

    }
}

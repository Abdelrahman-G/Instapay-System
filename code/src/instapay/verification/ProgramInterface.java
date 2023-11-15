package instapay.verification;

import instapay.user.User;
import instapay.user.UserDatabase;

import java.io.IOException;
import java.util.Scanner;

public class ProgramInterface {
    private UserDatabase database = new UserDatabase();
    private User activeUser = null;


    public void initiateProg() throws IOException {
        while (true){
            this.register();
            this.login();
        }
    }
    private void register() throws IOException {

        String username, password, phone_number, email, instapayHandle;
        ProgramInterface programInterface = new ProgramInterface();


        UserVerification verification = new UserVerification();
        //the process of verifying each user attribute
        username = verification.confirmUsername(database);
        password = verification.confirmPassword();
        phone_number = verification.confirmPhone(database);
        verification.verifyOTP(phone_number);
        instapayHandle = verification.confirmHandle(database);
        User user = verification.makeUserType();
        activeUser = user;
        database.addUser(user);
    }

    private void login() {
        LoginVerification loginVerification = new LoginVerification();
        System.out.println();
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("please enter your username: ");
            String username = input.nextLine();
            System.out.println("please enter your password: ");
            String password = input.nextLine();
            if (loginVerification.confirmCredentials(database, username, password)){
                System.out.println("Log in successful");
                break;
            }
            else {
                System.out.println("Username and password don't match\ntry again");
            }

        }
    }



    private void chooseOperation(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("1.Transfer money\n2.Inquire balance\n3.bill payment");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    activeUser.transferMoney();
            }
        }


    }


}

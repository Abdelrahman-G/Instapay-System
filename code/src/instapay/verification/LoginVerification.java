package instapay.verification;

import instapay.user.UserDatabase;

import java.util.Scanner;

public class LoginVerification {

    public boolean confirmCredentials(UserDatabase database){
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("please enter your username: ");
            String username = input.nextLine();
            System.out.println("please enter your password: ");
            String password = input.nextLine();

            if (database.validateUser(username,password)){
                return true;
            }else {
                System.out.println("Username and Password don't match");
            }
        }

    }
}

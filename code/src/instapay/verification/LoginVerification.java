package instapay.verification;

import instapay.user.UsersDatabase;

import java.util.Scanner;

public class LoginVerification {

    public boolean confirmUsername(UsersDatabase database){
        while (true){
            String username;
            System.out.println("please enter user name\n");
            Scanner input = new Scanner(System.in);
            username = input.nextLine();

        }
    }
}

import instapay.user.UsersDatabase;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    }

    public void createUser(){
        UsersDatabase database = new UsersDatabase();
        String username, password;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("please enter user name\n");
            System.out.println("NOTE: This username must be unique, username is permanent\n");
            username = input.nextLine();
            if (database.searchUsername(username)){
                System.out.println("This username is already taken\n");
            }
            else {
                System.out.println("This username is valid\n");
                break;
            }
        }
        System.out.println("please enter password\n");
        System.out.println("NOTE: Password must be at least 8 characters and strong (contains at least: 1 lowercase letter, 1 uppercase letter,1 number and 1 symbol)\n");
        password = input.nextLine();
    }
}
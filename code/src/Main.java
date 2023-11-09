import instapay.user.UsersDatabase;
import java.util.regex.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        

    }

    public void createUser(){
        UsersDatabase database = new UsersDatabase();
        String username, password, phone_number, email;
//        regex for a strong password with min length 8 and max length 20 that strong password criteria
        String password_regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        String phone_regex = "^01[0125]\\d{8}$";
        String email_regex = "^[a-z0-9_]{6,20}$";
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
        while(true) {
            System.out.println("please enter password\n");
            System.out.println("NOTE: Password must be at least 8 characters and strong (contains at least: 1 lowercase letter, 1 uppercase letter,1 number and 1 symbol)\n");
            password = input.nextLine();
            if (password.matches(password_regex))
                break;
            else {
                System.out.println("this password is not strong enough");
            }
        }

        while(true){
            System.out.println("Please enter your phone number");
            phone_number = input.nextLine();
            /*
            if the input number matches the regex
            and the number is not present in the database
            then this number is valid for a user.
            */
            if (phone_number.matches(phone_regex)&&!database.searchPhoneNumber(phone_number)) {
                break;
            }
            else {
                System.out.println("This is phone number is not valid\n");
            }
        }
        /*


        send and receive OTP



        */
        System.out.println("Create InstaPay handle\n");
        System.out.println("The account will end with @instapay (example: john123@instapay)\n");
        while(true) {
            System.out.println("Please enter handle");
        }
    }
}
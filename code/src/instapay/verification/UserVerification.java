package instapay.verification;

import instapay.account.Account;
import instapay.account.BankAccount;
import instapay.user.BankUser;
import instapay.user.EWalletUser;
import instapay.user.User;
import instapay.user.UsersDatabase;

import java.util.Random;
import java.util.Scanner;

public abstract class UserVerification {
    private String username;
    private String password;
    private String phone_number;
    private String instapayHandle;

    public String confirmUsername(UsersDatabase database){
        while(true) {
            System.out.println("please enter your username:");
            System.out.println("NOTE: This username must be unique, username is permanent and can't be Changed\n");
            Scanner input = new Scanner(System.in);
            username = input.nextLine();
            if (database.searchUsername(username)){
                System.out.println("This username is already taken");
            }
            else {
                System.out.println("This username is valid :)");
                return username;
            }
        }
    }
    public String confirmPassword(){
        //        regex for a strong password with min length 8 and max length 20 that strong password criteria
        String password_regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-_+=()])(?=\\S+$).{8,20}$";
        while(true) {
            System.out.println("please enter password\n");
            System.out.println("NOTE: Password must be at least 8 characters and strong (contains at least: 1 lowercase letter, 1 uppercase letter,1 number and 1 symbol)\n");
            Scanner input = new Scanner(System.in);
            password = input.nextLine();
            if (password.matches(password_regex)){
                System.out.println("Password is Valid :)");
                return password;
            }
            else {
                System.out.println("this password is not strong enough");
            }
        }
    }
    public String confirmPhone(UsersDatabase database){
        String phone_regex = "^01[0125]\\d{8}$";
        while(true){
            System.out.println("Please enter your phone number");
            Scanner input = new Scanner(System.in);
            phone_number = input.nextLine();

            /*
            if the input number matches the regex
            and the number is not present in the database
            then this number is valid for a user.
            */
            if (phone_number.matches(phone_regex)&&!database.searchPhoneNumber(phone_number)) {
                System.out.println("Phone Number is Valid! :)");
                return phone_number;
            }
            else {
                System.out.println("This is phone number is not valid\n");
            }
        }
    }

    public String confirmHandle(UsersDatabase database){
        while(true) {
            System.out.println("please enter your new InstaPay Handle");
            System.out.println("your account will end with @instapay and start with this handle (example: john123@instapay)\n");
            Scanner input = new Scanner(System.in);
            instapayHandle = input.nextLine();
            if (database.searchHandle(instapayHandle)){
                System.out.println("This username is already taken :(");
            }
            else {
                System.out.println("This handle is valid! :)");
                return instapayHandle;
            }
        }
    }

    public boolean verifyOTP(String phoneNumber){
        Random random = new Random();
        int max = 999999,min = 100000;
        int otp = random.nextInt(max - min) + min;
        System.out.println(otp);
        System.out.println("Code has been sent successfully to your phone number!");
        System.out.println("Enter the code: ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();

        while (in != otp){
            System.out.println("Code isn't right! a new verification code has been sent to your device.");
            otp = random.nextInt(max - min) + min;
            System.out.println(otp);
            System.out.println("Enter the code: ");
            in = input.nextInt();
        }
        System.out.println("Account verified successfully! :)");

        return true;
    }
    public abstract String validateSerial();

    public User makeUserType(int choice){
        User user = null;
        switch (choice) {
            case 1 -> {
                System.out.println("Enter Bank Account Number: ");
                String bankAccountNumber = this.validateSerial();
                Account account = new BankAccount(bankAccountNumber);
                user = new BankUser(phone_number, username, password, instapayHandle);
            }
            // bank account verification
            // check with api
            case 2 -> {
                System.out.println("Enter EWallet Number: ");
                String EWallet = this.validateSerial();
                user = new EWalletUser(phone_number, username, password, instapayHandle);
            }
            // ewallet verification
            //check with api
        }
        return user;
    }
}



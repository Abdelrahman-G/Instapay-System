import instapay.user.UserVerification;
import instapay.user.UsersDatabase;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


    }

    public void createUser(){
        UsersDatabase database = new UsersDatabase();
        String username, password, phone_number, email,instapayHandle;
        Scanner input = new Scanner(System.in);


        //the process of verifying each user attribute
        UserVerification verification = new UserVerification();
        username = verification.confirmUsername(database);
        password =verification.confirmPassword();
        phone_number = verification.confirmPhone(database);
        verification.sendOtp(phone_number);
        instapayHandle = verification.confirmHandle(database);

        //will add when the implementaion of child classes is complete

//        User user = new User(username,password,email,instapayHandle);

    }
}
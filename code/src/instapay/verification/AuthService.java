package instapay.verification;

import instapay.user.UsersDatabase;

import java.io.IOException;
import java.util.Scanner;
import instapay.user.*;

public class AuthService {
    UsersDatabase database = new UsersDatabase();
    public void createUser() throws IOException {

        String username, password, phone_number, email,instapayHandle;
        Scanner input = new Scanner(System.in);


        //the process of verifying each user attribute
        UserVerification verification = new UserVerification();
        username = verification.confirmUsername(database);
        password =verification.confirmPassword();
        phone_number = verification.confirmPhone(database);
        verification.verifyOTP(phone_number);
        instapayHandle = verification.confirmHandle(database);
        User user = new User(phone_number,username,password,instapayHandle);
        database.addUser(user);
        user.printUser();
    }

    public void login(){

    }
}

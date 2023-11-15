package instapay.verification;

import instapay.user.User;
import instapay.user.UserDatabase;

import java.io.IOException;

public class ProgramInterface {
    UserDatabase database = new UserDatabase();

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
        database.addUser(user);
    }

    private void login() {
        LoginVerification loginVerification = new LoginVerification();
        loginVerification.confirmCredentials(database);
    }
}

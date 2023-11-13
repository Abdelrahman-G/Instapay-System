import instapay.verification.AuthService;
import instapay.verification.UserVerification;
import instapay.user.UsersDatabase;

import java.io.IOException;
import java.util.Scanner;
import instapay.account.wallet.EPayWallet;

public class Main {
    public static void main(String[] args) throws IOException {
        AuthService authentication = new AuthService();
        int a = 2;
        while (a>0) {
            authentication.createUser();
            a--;
        }
    }


}
import instapay.verification.AuthService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AuthService authentication = new AuthService();
        authentication.createUser();
    }


}
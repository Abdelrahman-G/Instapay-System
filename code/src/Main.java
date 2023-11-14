import instapay.verification.Facade;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Facade authentication = new Facade();
        authentication.createUser();
    }


}
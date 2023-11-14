package instapay.verification;

import java.util.Scanner;

public class EWalletUserVerification extends UserVerification{

    @Override
    public String validateSerial() {
        System.out.println("Enter your Ewallet serial number");
        Scanner input = new Scanner(System.in);
        String serial = input.nextLine();
        while (serial.length() != 16){
            System.out.println("serial number isn't correct!!");
            System.out.println("Try again: ");
            serial = input.nextLine();
        }
        return serial;
    }
}

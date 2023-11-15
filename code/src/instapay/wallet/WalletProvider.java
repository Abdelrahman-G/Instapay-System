package instapay.wallet;

import java.util.Random;

public abstract class WalletProvider {
    public abstract boolean verifyPhoneNumber(String phoneNum);

    public double getBalance(String phoneNumber){
        int min = 100000, max = 999999;
        Random random = new Random();
        double balance = random.nextDouble(max - 100000) - min;
        return balance;
    }
}

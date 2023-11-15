package instapay.transaction;

import instapay.Account.InstapayAccount;

public class WalletTransaction extends UserTransaction {
    public void transferMoney(double amount){
        System.out.println("WalletTransaction");
        System.out.println("Please Enter Wallet Number: ");
    };

    @Override
    public void transferMoney(InstapayAccount sender, InstapayAccount receiver, double amount) {
        return;
    }

}

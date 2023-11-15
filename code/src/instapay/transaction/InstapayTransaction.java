package instapay.transaction;

import instapay.Account.InstapayAccount;

public class InstapayTransaction extends UserTransaction {

    public void transferMoney(double amount){

    };

    @Override
    public void transferMoney(InstapayAccount sender, InstapayAccount receiver, double amount) {
        return;
    }
}

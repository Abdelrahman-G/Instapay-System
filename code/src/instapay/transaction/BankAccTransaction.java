package instapay.transaction;

import instapay.Account.InstapayAccount;

public class BankAccTransaction extends UserTransaction {

    public void transferMoney(double amount){
        //to be implemented
    };

    @Override
    public void transferMoney(InstapayAccount sender, InstapayAccount receiver, double amount) {

    }
}

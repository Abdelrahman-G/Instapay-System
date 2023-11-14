package instapay.Account;
import instapay.Bank.*;

public class BankAccount extends InstapayAccount {
    private Bank bank;
    private String serial;

    public BankAccount(String serial, String phoneNumber, String handle) {
        super( phoneNumber, handle);
        this.serial = serial;
    }

    public double inquireBalance(){
        return bank.getBalance();
    }

    public void transferMoney(){

    }

    public void payBill(){

    }
}

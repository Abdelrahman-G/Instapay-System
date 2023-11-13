package instapay.account;

public class BankAccount extends Account{

    private String accountNumber;
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean verifyAccount(){
        //to be implemented
        return false;
    }
}

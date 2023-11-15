package instapay.Account;

public abstract class InstapayAccount {
    protected String phoneNumber;
    protected String handle;
    public InstapayAccount(String phoneNumber,String handle){
        this.phoneNumber = phoneNumber;
        this.handle = handle;
    }

    public abstract double inquireBalance(String credentials);
    public abstract void transferMoney();
    public abstract void payBill();
}


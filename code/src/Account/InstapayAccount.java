package Account;

public abstract class InstapayAccount {
    protected String phoneNumber;
    protected String serial;
    protected String handle;
    public abstract double inquireBalance();
    public abstract void transferMoney();
    public abstract void payBill();
}


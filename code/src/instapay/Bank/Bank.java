package instapay.Bank;

public abstract class Bank {
    private double balance;
    private String serial;
    public abstract boolean verifySerial();
}

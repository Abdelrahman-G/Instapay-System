package instapay.Bank;

public abstract class Bank {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    private double balance;
    private String serial;
    public abstract boolean verifySerial(String serial);
}

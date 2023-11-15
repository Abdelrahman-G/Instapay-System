package instapay.Bank;

public abstract class Bank {
    public abstract Boolean verifySerial(String serial);
    public abstract Double getUserBalance(String serial);
    public String getSerial() {
        return "7855111234432232";
    }
}

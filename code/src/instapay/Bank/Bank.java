package instapay.Bank;

public abstract class Bank {
    public Boolean verifySerial(String serial){
        return serial.length() == 16;
    };
    public abstract Double getUserBalance(String serial);
    public String getSerial() {
        return "7855111234432232";
    }
}

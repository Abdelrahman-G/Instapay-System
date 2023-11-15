package instapay.Bank;

public class QNB extends Bank{
<<<<<<< HEAD

    @Override
    public Boolean verifySerial(String serial) {
=======
    public boolean verifySerial(String serial){
>>>>>>> d9399b16b1e8d06e3fc151190898e2bc64785fb9
        return true;
    }

    @Override
    public Double getUserBalance(String serial) {
        return 100000.0;
    }
}

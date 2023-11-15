package instapay.bill;

public class Gas extends Bill{

    @Override
    public boolean verifyPaymentCode() {
        return true;
    }

}

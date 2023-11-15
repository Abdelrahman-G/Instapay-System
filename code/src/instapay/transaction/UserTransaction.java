package instapay.transaction;
import instapay.Account.*;

public abstract class UserTransaction {
    public abstract void transferMoney(InstapayAccount sender,InstapayAccount receiver,double amount);
}

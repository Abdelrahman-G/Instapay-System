package instapay.transaction;
import instapay.user.UsersDatabase;

public abstract class UserTransaction {
    protected String identifier;
    public abstract void transferMoney(double amount);
}

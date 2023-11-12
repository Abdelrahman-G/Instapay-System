package instapay.user;

public abstract class UserTransaction {
    protected String identifier;
    public abstract void transferMoney();
}

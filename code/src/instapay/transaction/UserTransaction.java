package instapay.transaction;

public abstract class UserTransaction {
    protected String identifier;
    public abstract void transferMoney();
}

package instapay.Account;
import instapay.user.*;

import java.util.ArrayList;
import java.util.Objects;

public abstract class InstapayAccount {
    protected String phoneNumber;
    private UserDatabase database;
    protected String handle;
    public InstapayAccount(String phoneNumber,String handle){
        this.phoneNumber = phoneNumber;
        this.handle = handle;
    }

    public abstract double inquireBalance(String credentials);
    public abstract void transferMoney();
    public abstract void payBill();
    public boolean tansferToInstapay(String instapayHandle, double amount){

        ArrayList<User> users = database.getUsers_array_list();
        User transferedTo = null;
        for (User user:users) {
            if (Objects.equals(user.getAccount().handle, instapayHandle)){
                transferedTo = user;
                break;
            }
        }
        if (transferedTo==null)
            return false;

        if (inquireBalance())



    }
}


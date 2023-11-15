package instapay.Account;
import instapay.user.*;

import java.util.ArrayList;
import java.util.Objects;
import instapay.transaction.*;

public abstract class InstapayAccount {
    protected String phoneNumber;
    private UserDatabase database;
    protected String handle;
    public InstapayAccount(String phoneNumber,String handle){
        this.phoneNumber = phoneNumber;
        this.handle = handle;
    }

    public abstract double inquireBalance(String credentials);
    public abstract void payBill();

    public abstract boolean transferMoney();

    public boolean tansferToInstapay(String instapayHandle, double amount){
        UserTransaction transaction = new InstapayTransaction();
        transaction.operate(sender,reciever,amount);
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

        if ()



    }
    public boolean transferToWallet(String phoneNum,double amount){

    }
}


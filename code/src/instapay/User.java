package instapay;

import instapay.UserTransaction;
import instapay.account.Account;

public abstract class User {
    protected String mobileNumber;
    protected String username;
    protected String password;
    protected String instapay_handle;
    protected Account account;
    protected UserTransaction userTransact;

    public void login(String username, String password){
        //to be implemented


    }
    protected String getUsername(){
        return username;
    }
    protected String getPassword(){
        return password;
    }
    protected String getPhoneNumber(){
        return mobileNumber;
    }
    protected String getInstapayHandle(){
        return instapay_handle;
    }

}

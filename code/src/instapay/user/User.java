package instapay.user;

import instapay.transaction.UserTransaction;
import instapay.account.Account;

import java.util.ArrayList;

public  class User {
    protected String mobileNumber;
    protected String username;
    protected String password;
    protected String instapay_handle;
    protected ArrayList<Account> account;
    protected UserTransaction userTransact;

    public User(String mobileNumber, String username, String password, String instapay_handle) {
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
        this.instapay_handle = instapay_handle;
//        this.account.add(account);
//        this.userTransact = userTransact;
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

    /*to be removed*/
    public void printUser(){
        System.out.println(this.username+" "+this.password+" "+this.mobileNumber+" "+this.instapay_handle+"@instapay\n");
    }

}

package instapay.user;

import instapay.Account.InstapayAccount;
import instapay.transaction.UserTransaction;

public  class User {
    protected String mobileNumber;
    protected String username;
    protected String password;
    protected String instaPayHandle;
    protected InstapayAccount account;
    protected UserTransaction userTransact;

    public User(String mobileNumber, String username, String password, String instapay_handle ,InstapayAccount account) {
        this.account = account;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
        this.instaPayHandle = instapay_handle;
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
        return instaPayHandle;
    }

    /*to be removed*/
    public void printUser(){
        System.out.println(this.username+" "+this.password+" "+this.mobileNumber+" "+this.instaPayHandle +"@instapay\n");
    }

    public void transferMoney(){
        this.account.transferMoney();
    }

    public void payBill(){
        this.account.payBill();
    }

}

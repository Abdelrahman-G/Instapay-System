package instapay.user;

import java.util.HashMap;

public abstract class User {
    public String phone_number;
    private String username;
    private String password;
    public String instapay_account;

    public void signIn(String username,String password){


    }
    protected String getUsername(){
        return username;
    }
    protected String getPassword(){
        return password;
    }
    protected String getPhoneNumber(){
        return phone_number;
    }
    protected String getInstapayAcc(){
        return instapay_account;
    }

}

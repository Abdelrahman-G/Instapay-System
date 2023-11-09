package instapay.user;

public abstract class User {
    public String phone_number;
    private String username;
    private String password;
    public String instapay_handle;

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
    protected String getInstapayHandle(){
        return instapay_handle;
    }

}

package instapay.user;

public abstract class User {
    public String phone_number;
    private String username;
    private String password;
    public String instapay_handle;

    public User(String phone_number, String username, String password, String instapay_handle) {
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
        this.instapay_handle = instapay_handle;
    }

    public void signIn(String username, String password){


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

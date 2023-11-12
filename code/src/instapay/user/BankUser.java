package instapay.user;

public class BankUser extends User{

    public BankUser(String phone_number, String username, String password, String instapay_handle) {
        this.mobileNumber = phone_number;
        this.username = username;
        this.password = password;
        this.instapay_handle = instapay_handle;
    }

    public boolean register(){
        //to be implemented

        return false;
    }

    public boolean verifyAccount(){
        //to be implemented

        return false;
    }

    public boolean transferMoney(){
        //to be implemented


        return false;
    }

}

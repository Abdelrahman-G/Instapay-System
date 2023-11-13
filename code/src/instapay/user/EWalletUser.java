package instapay.user;

public class EWalletUser extends User {

    public EWalletUser(String phone_number, String username, String password, String instapay_handle) {
        super(phone_number,username,password,instapay_handle);
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

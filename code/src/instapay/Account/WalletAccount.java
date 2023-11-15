package instapay.Account;
<<<<<<< HEAD
=======

>>>>>>> d9399b16b1e8d06e3fc151190898e2bc64785fb9

public class WalletAccount extends InstapayAccount {
    private WalletProvider walletProvider;

    public WalletAccount(String phoneNumber, String handle) {
        super( phoneNumber, handle);
    }

    public double inquireBalance(){
        return walletProvider.getBalance();
    }

    public void transferMoney(){

    }

    public void payBill(){

    }


}

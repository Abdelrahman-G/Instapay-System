package instapay.Account;


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

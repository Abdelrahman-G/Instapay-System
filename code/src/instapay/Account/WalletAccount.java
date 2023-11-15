package instapay.Account;
import instapay.wallet.WalletProvider;

public class WalletAccount extends InstapayAccount {
    private WalletProvider walletProvider;

    public WalletAccount(String phoneNumber, String handle) {
        super( phoneNumber, handle);
    }

    public double inquireBalance(String credentials){
        return walletProvider.getBalance(credentials);
    }

    public void transferMoney(){

    }

    public void payBill(){

    }


}

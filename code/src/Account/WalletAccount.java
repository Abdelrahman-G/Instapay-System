package Account;

public class WalletAccount extends InstapayAccount {
    private WalletProvider walletProvider;

    public double inquireBalance(){
        return walletProvider.getBalance();
    }

    public void transferMoney(){

    }

    public void payBill(){

    }


}

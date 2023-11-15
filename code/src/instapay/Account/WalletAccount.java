package instapay.Account;
import instapay.user.User;
import instapay.wallet.WalletProvider;
import instapay.user.UserDatabase;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class WalletAccount extends InstapayAccount {
    private WalletProvider walletProvider;

    public WalletAccount(String phoneNumber, String handle, WalletProvider walletProvider) {
        super( phoneNumber, handle);
        this.walletProvider = walletProvider;
    }

    public double inquireBalance(String credentials){
        return walletProvider.getBalance(this.phoneNumber);
    }

    public void addMoney(double amount) {
        this.walletProvider.addBalance(amount, this.phoneNumber);
    }

    public boolean deductMoney(double amount) {
        return this.walletProvider.deductBalance(this.phoneNumber,amount);
    }

    @Override
    public boolean transferMoney(String type, double amount, String credentials, UserDatabase database) {
        return switch (type) {
            case "Instapay" -> transferToInstapay(credentials, amount, database);
            case "Wallet" -> transferToWallet(credentials, amount);
            default -> false;
        };
    }

    public void payBill(){

    }

    public String getAccountType(){
        return "Wallet";
    }




}

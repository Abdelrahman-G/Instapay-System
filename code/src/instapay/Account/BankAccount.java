package instapay.Account;

import instapay.Bank.Bank;

import java.util.Random;
import java.util.Scanner;

public class BankAccount extends InstapayAccount {
    private Bank bank;
    private Scanner input = new Scanner(System.in);

    public BankAccount(String phoneNumber, String handle) {
        super(phoneNumber, handle);
    }

    @Override
    public double inquireBalance(String credentials) {
        int min = 100000, max = 999999;
        Random random = new Random();
        double balance = random.nextDouble(max - 100000) - min;
        return balance;
    }


    public void transferMoney(){
        System.out.println("Enter the amount to be transferred: ");
        double amount = input.nextDouble();
        if (bank.getUserBalance(bank.getSerial()) > amount) {
            //transfer to details
        }
    }

    public void payBill(){

    }
}

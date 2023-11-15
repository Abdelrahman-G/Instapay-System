package instapay.Account;
import instapay.Bank.Bank;

import java.util.Scanner;

public class BankAccount extends InstapayAccount {
    private Bank bank;
    private Scanner input = new Scanner(System.in);
    public double inquireBalance(){
        System.out.println("Enter your serial number: ");
        String serial = input.nextLine();
        return bank.getUserBalance(serial);
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

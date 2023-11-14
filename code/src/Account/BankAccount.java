package Account;

public class BankAccount extends InstapayAccount {
    private Bank bank;

    public double inquireBalance(){
        return bank.getBalance();
    }

    public void transferMoney(){

    }

    public void payBill(){

    }
}

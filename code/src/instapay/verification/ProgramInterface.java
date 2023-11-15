package instapay.verification;

import instapay.user.User;
import instapay.user.UserDatabase;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ProgramInterface {
    private UserDatabase database = new UserDatabase();
    private User activeUser = null;



    public void initiateProg() throws IOException {
        while (true){
            this.register();
            this.login();
            this.chooseOperation();
        }
    }
    private void register() throws IOException {

        String username, password, phone_number, email, instapayHandle;
        ProgramInterface programInterface = new ProgramInterface();


        UserVerification verification = new UserVerification();
        //the process of verifying each user attribute
        username = verification.confirmUsername(database);
        password = verification.confirmPassword();
        phone_number = verification.confirmPhone(database);
        verification.verifyOTP(phone_number);
        instapayHandle = verification.confirmHandle(database);
        User user = verification.makeUserType();
        activeUser = user;
        database.addUser(user);
    }

    private void login() {
        LoginVerification loginVerification = new LoginVerification();
        System.out.println();
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("please enter your username: ");
            String username = input.nextLine();
            System.out.println("please enter your password: ");
            String password = input.nextLine();
            if (loginVerification.confirmCredentials(database, username, password)){
                System.out.println("Log in successful");
                break;
            }
            else {
                System.out.println("Username and password don't match\ntry again");
            }

        }
    }

    private void chooseOperation(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("1.Transfer money\n2.Inquire balance\n3.bill payment");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    if (Objects.equals(activeUser.getAccountType(), "Bank")){
                        bankAccountTransferMenu();
                    }
                    else if(activeUser.getAccountType() == "Wallet"){
                        walletTransferMenu();
                    }
                    break;
                case 2:
                    System.out.println("Your balance is: " + activeUser.inquireBalance());
                    break;
            }
        }
    }

    public void bankAccountTransferMenu(){
        Scanner transferType = new Scanner(System.in);
        System.out.println("1.Transfer to instapay account\n2.Transfer to bank account\n3.Transfer to Wallet:");
        int choice = transferType.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the instapay handle of the account you want to transfer to: ");
                Scanner instapayHandle = new Scanner(System.in);
                String handle = instapayHandle.nextLine();
                System.out.println("Enter the amount you want to transfer: ");
                Scanner amount = new Scanner(System.in);
                double transferAmount = amount.nextDouble();
                if(activeUser.transferMoney("Instapay",transferAmount,handle, database)){
                    System.out.println("Transfer successful");
                }
                else {
                    System.out.println("Transfer failed");
                }
                break;
            case 2:
                System.out.println("Enter the bank account number you want to transfer to: ");
                Scanner bankAccountNumber = new Scanner(System.in);
                String accountNumber = bankAccountNumber.nextLine();
                System.out.println("Enter the amount you want to transfer: ");
                Scanner amount2 = new Scanner(System.in);
                double transferAmount2 = amount2.nextDouble();
                if(activeUser.transferMoney("Bank",transferAmount2,accountNumber, database)){
                    System.out.println("Transfer successful");
                }
                else {
                    System.out.println("Transfer failed");
                };
                break;
            case 3:
                System.out.println("Enter the phone number you want to transfer to: ");
                Scanner phoneNumber = new Scanner(System.in);
                String phoneNum = phoneNumber.nextLine();
                System.out.println("Enter the amount you want to transfer: ");
                Scanner amount3 = new Scanner(System.in);
                double transferAmount3 = amount3.nextDouble();
                if(activeUser.transferMoney("Wallet",transferAmount3,phoneNum, database)){
                    System.out.println("Transfer successful");
                }
                else {
                    System.out.println("Transfer failed");
                };
                break;

        }
    }

    public void walletTransferMenu(){
        Scanner transferType = new Scanner(System.in);
        System.out.println("1.Transfer to instapay account\n2.Transfer to Wallet");
        int choice = transferType.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the instapay handle of the account you want to transfer to: ");
                Scanner instapayHandle = new Scanner(System.in);
                String handle = instapayHandle.nextLine();
                System.out.println("Enter the amount you want to transfer: ");
                Scanner amount = new Scanner(System.in);
                double transferAmount = amount.nextDouble();
                if(activeUser.transferMoney("Instapay",transferAmount,handle, database)){
                    System.out.println("Transfer successful");
                }
                else {
                    System.out.println("Transfer failed");
                }
                break;
            case 2:
                System.out.println("Enter the phone number you want to transfer to: ");
                Scanner phoneNumber = new Scanner(System.in);
                String phoneNum = phoneNumber.nextLine();
                System.out.println("Enter the amount you want to transfer: ");
                Scanner amount3 = new Scanner(System.in);
                double transferAmount3 = amount3.nextDouble();
                if(activeUser.transferMoney("Wallet",transferAmount3,phoneNum, database)){
                    System.out.println("Transfer successful");
                }
                else {
                    System.out.println("Transfer failed");
                };
                break;

        }
    }

}

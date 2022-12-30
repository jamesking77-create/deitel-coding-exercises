package deitelChapters.chapterSix;

import java.util.Scanner;

public class Account {
    private String accountName;
    private int pin;
    private String accountType;
    private double balance;
    private double withdraw;

    private long accountNumber;
    public Account(String accountName, int pin, String accountType, double balance, double withdraw, long accountNumber) {
        this.accountName = accountName;
        this.pin = pin;
        this.accountType = accountType;
        this.balance = balance;
        this.withdraw = withdraw;

        this.accountNumber = accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }


    public String getAccountName() {
        return accountName;
    }

    public int getPin() {

        return pin;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {

        return balance;
    }

    public double getWithdraw() {
        withdraw = balance - withdraw;
        balance = withdraw;

        return balance;
    }

      public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setDeposit(double deposit) {
        this.balance = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double setTransfer(Account account2) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter account number of beneficiary: ");
        int userInput = scanner.nextInt();
        while (userInput != account2.accountNumber){
            System.out.println("invalid account number");
            System.out.println("Please enter account number of beneficiary: ");
            userInput = scanner.nextInt();
        }

        if (userInput == account2.accountNumber){
            System.out.println("ACCOUNT NAME: "+account2.accountName);
            System.out.print("Please enter your pin:");
        }    int userInput2 = scanner.nextInt();
        while (userInput2 != pin){
            System.out.print("wrong pin try again: ");
             userInput2 = scanner.nextInt();
        }
        System.out.print("Enter amount to transfer: ");
        int userInput3 = scanner.nextInt();
        if (userInput3 > balance){
            System.err.println("insufficient funds...");
        }else {
        balance = balance-userInput3;
        System.out.println("Transfer successful...");
        System.out.println(account2.getAccountName() + " has been credited with: " + userInput3);
        System.out.println("Balance is: " + balance);
        System.out.println(account2.getAccountName() +" balance is: "+(account2.balance+ userInput3));
        }return balance;}
}

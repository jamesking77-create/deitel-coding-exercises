package deitelChapters.chapterTwo;

public class Accounts {
    private int balance;
    private int withdraw;
    private String accountType;
    private String name;
    private String admin;

    public void setDeposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    public int getBalance() {

        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            balance = balance - amount;
        }
    }


}

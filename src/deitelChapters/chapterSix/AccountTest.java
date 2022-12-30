package deitelChapters.chapterSix;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("james", 7070, "savings",
                5000, 0,  313567996);
        Account account2 = new Account("bless", 4536, "savings",
                7000, 0,  583498763);
        System.out.println(account1.getAccountName());
        System.out.println(account1.getAccountType());
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.setTransfer(account2));


    }
}

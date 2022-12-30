package deitelChapters.chapterSix;

import java.util.Scanner;

public class UserReceipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                What would you like to have?
                       we have:
                      1. noodles>>>
                      2. chocolate>>>
                      3. biscuits>>>
                      4. candy>>>
                      5. ice-cream>>>
                      6. chips>>>
                      7. chicken>>>""");
        String user_input = input.nextLine();


    }
}

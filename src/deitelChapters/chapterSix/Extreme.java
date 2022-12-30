package deitelChapters.chapterSix;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many time would you like to input a number? ");
        int first_user_input = input.nextInt();
        System.out.println("Please enter a number: ");
       int  second_user_input = input.nextInt();
       int maximum = second_user_input;
       int minimum = second_user_input;

        for (int i = 1; i < first_user_input; i++) {
            System.out.println("Please enter a number: ");
             second_user_input = input.nextInt();
            if (second_user_input > maximum){
                maximum = second_user_input;
            }
            if (second_user_input < minimum){
                minimum = second_user_input;
            }

        }


        System.out.printf("The maximum number is %d%nThe minimum number is %d", maximum, minimum);


    }
}

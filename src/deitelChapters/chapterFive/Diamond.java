package deitelChapters.chapterFive;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter an odd number: ");
        int userInput = input.nextInt();
        int i ;
        int j ;
        int blank = (userInput-1)/ 2;
        String asterisk = "*";
        for ( i = 1; i < userInput; i +=2){
            for (j = 0; j < blank; j++){
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++){
                System.out.print(asterisk);
            }
            System.out.println();
            blank--;
        }
        blank = 1;
        for (i = userInput-2; i > 0; i -=2){
            for (j = 0; j < blank; j++ ){
                System.out.print(" ");
            }
            for (j = i; j > 0; j--){
                System.out.print(asterisk);
            }
            System.out.println();
            blank++;
        }
        System.out.printf("%d%20d%n",userInput, userInput);
        System.out.printf("%-4s%20s%n","james", "king");
    }

}

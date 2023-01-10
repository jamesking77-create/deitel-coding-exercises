package deitelChapters.chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int randomNumbers = random.nextInt(1000);
        System.out.println("Guess a number from 1 - 1000: ");
        int userInput = scanner.nextInt();
        if (userInput < 0 || userInput > 1000){
            System.err.println("input out of bound");
        }

        if (userInput > randomNumbers){
            System.out.println("Sorry, number too high");
        }
        if (userInput < randomNumbers) {
            System.out.println("Sorry, number too low");
        }
            if (userInput == randomNumbers){
                System.out.println("Congratulations");
            }
            System.out.println("want to play again? (Reply yes or no)");
            String  userInput2 = scanner.next();
        if (userInput2.equals("no")){
            System.out.println("GAME OVER...");
        }
        while (!userInput2.equals("yes") && !userInput2.equals("no")){
            System.err.println("wrong input");
            System.out.println("want to play again? (Reply yes or no)");
              userInput2 = scanner.next();
        }

            while (userInput2.equals("yes")){
                System.out.println("Guess a number from 1 - 1000: ");
                 userInput = scanner.nextInt();
                if (userInput < 0 || userInput > 1000){
                    System.err.println("input out of bound");
                }
                if (userInput > randomNumbers){
                System.out.println("Sorry, number too high");
                }
                 if (userInput < randomNumbers) {
                System.out.println("Sorry, number too low");
                }
                if (userInput == randomNumbers){
                System.out.println("Congratulations, you guessed the number");break;
                }
                System.out.println("want to play again? (Reply yes or no)");
                userInput2 = scanner.next();
                if (userInput2.equals("no")){
                    System.out.println("GAME OVER...");
                    break;
                }
        }

    }
}

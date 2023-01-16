package deitelChapters.chapterSix;
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {

    private static final GuessingGamePlayer[] players = new GuessingGamePlayer[2];
    private static final Scanner scanner = new Scanner(System.in);

    public static void registerPlayer() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter player " + (i + 1) + " name: ");
            String playerName = scanner.nextLine();
            players[i] = new GuessingGamePlayer(playerName);
        }
        System.out.println();
    }


    public static void   playGuessingGame(){
        int userInput = 0;
        
        SecureRandom random = new SecureRandom();
        int randomNumbers = 1 + random.nextInt(7);
        while (userInput != randomNumbers) {
            for (GuessingGamePlayer player : players) {
                System.out.printf("%s it your turn to guess a number from 1 - 7: ", player.getName());
                userInput = scanner.nextInt();
                validateGuesses(userInput, randomNumbers);
                if (userInput == randomNumbers) {
                    System.out.println("Congratulations you win!!!");
                    break;
                }
            }
        }
                System.out.println("want to play again? (Reply yes or no)");
                String userInput2 = scanner.next();
         while (userInput2.equals("yes")){
            playGuessingGame();
        }
            if (userInput2.equals("no")){
                System.out.println("GAME OVER...");
            }


            while (!userInput2.equals("yes") && !userInput2.equals("no")){
                    System.out.println("wrong input");
                    System.out.println("want to play again? (Reply yes or no)");
                     userInput2 = scanner.next();
            }







    }

    public static boolean gameIsNotOver(){

        return false;
    }


        public static void validateGuesses(int userInput, int randomNumbers){
            if (userInput < 0 || userInput > 7) {
                System.out.print("input out of bound..");
            }
            if (userInput > randomNumbers) {
                System.out.println("Sorry, number too high");
            }
            if (userInput < randomNumbers) {
                System.out.println("Sorry, number too low");
            }

    }

    }


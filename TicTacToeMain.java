package deitelChapters.chapter8.ticTacToe;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TicTacToeMain {

    private static final Scanner scanner = new Scanner(System.in);
//    private static final TicTacToePlayer [] players = new TicTacToePlayer[2];


    public static void main(String[] args) throws InterruptedException {
        startTicTacToe();
    }

    private static void startTicTacToe() throws InterruptedException {
        System.out.println("""
                +===============================+
                ||      TIC - TAC - TOE        ||
                +===============================+
                ||   1 -> SINGLE PLAYER        ||
                +===============================+
                ||   2 -> MULTIPLAYER PLAYER   ||
                +===============================+
                ||   3 -> EXIT GAME            ||
                +===============================+
                """);
        String userInput = scanner.next();
        switch (userInput.charAt(0)){
            case '1' -> registerSinglePlayers();
            case '2' -> registerPlayers();
            case '3' -> exitGame();
            default -> startTicTacToe();
        }
    }


    public static void registerPlayers() throws InterruptedException {
        for (int i = 0; i < TicTacToeGame.players.length ; i++) {
            System.out.printf("Enter player ( %d ) name: ", i +1);
            String playerName = scanner.next();
            TicTacToeGame.players[i] = new TicTacToePlayer(playerName);
        }
        System.out.println();
        promptGameInstructions();
    }


    public static void promptGameInstructions() throws InterruptedException {
        System.out.println("""
                       +----------------------+
                       | 0: Game Instructions |
                       +----------------------+
                       | 1: Skip to Game      |
                       +----------------------+
                """);
        int gameIntro = scanner.nextInt();
        if (gameIntro != 1 && gameIntro != 0){
            System.out.println("wrong input...");
            promptGameInstructions();
        }

        if (gameIntro == 0){
            System.out.println("""
                     You are to select any position from
                     the table below to place your value.
                                    X OR O
                                  [1, 2, 3]
                                  [4, 5, 6]
                                  [7, 8, 9]
                              +----------------+
                              |  0: Start Game |
                              +----------------+
                              |  1: Back       |
                              +----------------+
                    """);
            int  gameIntro1 = scanner.nextInt();

            if (gameIntro1 != 1 && gameIntro1 != 0){
                System.out.println("wrong input...");
                promptGameInstructions();
            }

            if (gameIntro1 == 1){
                promptGameInstructions();
            }
            if (gameIntro1 == 0){
                playTicTacToe();
            }


        }if (gameIntro == 1){
            playTicTacToe();
        }
    }


    private static void playTicTacToe() throws InterruptedException {
        String response ;
        do {
            TicTacToeGame.fillBoard();
            do {
                try {
                    promptPlayerMove();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (!TicTacToeGame.isWon());
            System.out.println("Do you want to play again (Yes or No)?");
            response = scanner.next();
            while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
                System.out.println("Do you want to play again?");
                response = scanner.next();
            }
            TicTacToeGame.resetPlayCount();
        }while (response.equalsIgnoreCase("yes"));
        startTicTacToe();
    }
    public static void promptPlayerMove(){
        String playerName = TicTacToeGame.players[TicTacToePlayer.getCurrentPlayer()].getName();
        System.out.printf("""
                    +----------------------------------------------------------+
                    | %s, pick a position to place a symbol on the board
                    +----------------------------------------------------------+
                     """, playerName);
        int playerPosition = scanner.nextInt();
        if (playerPosition < 1 || playerPosition > 9) {
            throw new IllegalArgumentException("number out of bound...");
        } else {
            TicTacToeGame.setPlayerPosition(playerPosition);
        }
    }






    public static void registerSinglePlayers() throws InterruptedException {
        String computer = "computer";

        System.out.print("Enter your name: ");
        String playerName = scanner.next();
        TicTacToeSinglePlayerGame.players[0] = new TicTacToePlayer(playerName);
        TicTacToeSinglePlayerGame.players[1] = new TicTacToePlayer(computer);

        System.out.println();
        promptSinglePlayerGameInstructions();
    }


    public static void promptSinglePlayerGameInstructions() throws InterruptedException {
        System.out.println("""
                       +----------------------+
                       | 0: Game Instructions |
                       +----------------------+
                       | 1: Skip to Game      |
                       +----------------------+
                """);
        int gameIntro = scanner.nextInt();
        if (gameIntro != 1 && gameIntro != 0){
            System.out.println("wrong input...");
            promptSinglePlayerGameInstructions();
        }

        if (gameIntro == 0){
            System.out.println("""
                     You are to select any position from
                     the table below to place your value.
                                    X OR O
                                  [1, 2, 3]
                                  [4, 5, 6]
                                  [7, 8, 9]
                              +----------------+
                              |  0: Start Game |
                              +----------------+
                              |  1: Back       |
                              +----------------+
                    """);
            int  gameIntro1 = scanner.nextInt();

            if (gameIntro1 != 1 && gameIntro1 != 0){
                System.out.println("wrong input...");
                promptSinglePlayerGameInstructions();
            }
            if (gameIntro1 == 1){
                promptSinglePlayerGameInstructions();
            }
            if (gameIntro1 == 0){
                playTicTacToe2();
            }
        }if (gameIntro == 1){
                playTicTacToe2();
        }
    }

    public static void playTicTacToe2() throws InterruptedException {
       String response ;
       do {
           TicTacToeSinglePlayerGame.fillBoard();
           do {
               try {
                   promptSinglePlayerMove();
               }catch (IllegalArgumentException error){
                   System.out.println(error.getMessage());
               }
           } while (!TicTacToeSinglePlayerGame.isWon());
           System.out.println("Do you want to play again (Yes or No)?");
           response = scanner.next();
           while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
               System.out.println("Do you want to play again?");
               response = scanner.next();
           }
           TicTacToeSinglePlayerGame.resetPlayCount();
       }while (response.equalsIgnoreCase("yes"));
       startTicTacToe();
    }



    public static void promptSinglePlayerMove() throws InterruptedException {

            int playerPosition = 0;
            String playerName = TicTacToeSinglePlayerGame.players[TicTacToePlayer.getCurrentPlayer()].getName();
            if (Objects.equals(playerName, TicTacToeSinglePlayerGame.players[0].getName())) {
                System.out.printf("""
                        +----------------------------------------------------------+
                        | %s, pick a position to place a symbol on the board
                        +----------------------------------------------------------+
                         """, playerName);
                playerPosition = scanner.nextInt();
                if (playerPosition < 1 || playerPosition > 9) {
                    throw new IllegalArgumentException("number out of bound...");
                } else {
                    TicTacToeSinglePlayerGame.setPlayerPosition(playerPosition);
                    playerName = TicTacToeSinglePlayerGame.players[1].getName();
                    if (TicTacToeSinglePlayerGame.isWon()){
                        return;
                    }
                    System.out.println("+---------------------------------------------------------+");
                    System.out.print(playerName + " is playing");
                    for (int k = 0; k < 3; k++) {
                        System.out.print("..");
                        TimeUnit.SECONDS.sleep(1);
                    }
                    System.out.println("\n+---------------------------------------------------------+");
                }
            }


            else if (Objects.equals(playerName, TicTacToeSinglePlayerGame.players[1].getName())) {
                try {
                SecureRandom secureRandom = new SecureRandom();
                    playerPosition = (1 + secureRandom.nextInt(9));
                    TicTacToeSinglePlayerGame.setPlayerPosition(playerPosition);

                }catch (IllegalArgumentException error){
                    System.out.println(error.getMessage());

                }
            }
        }

    public static void exitGame(){
        System.exit(0);
    }
}

package deitelChapters.chapter8.ticTacToe;

import deitelChapters.chapter7.Player;

import java.util.Arrays;
import java.util.Scanner;

import static deitelChapters.chapter8.ticTacToe.TicTacCharacters.EMPTY;

public class TicTacToeGame {
    private static final TicTacToePlayer [] players = new TicTacToePlayer[2];

    private static final Scanner scanner = new Scanner(System.in);

    private static final String[][] gameBoard = new String[3][3];



    public static void registerPlayers(){
        for (int i = 0; i < players.length ; i++) {
            System.out.printf("Enter player ( %d ) name: ", i +1);
            String playerName = scanner.next();
            players[i] = new TicTacToePlayer(playerName);
        }
        System.out.println();
        promptGameInstructions();
    }
    public static void promptGameInstructions(){
        System.out.println("""
                       +----------------------+
                       | 0: Game Instructions |
                       +----------------------+
                       | 1: Skip to Game      |
                       +----------------------+
                """);
        int gameIntro = scanner.nextInt();
        if (gameIntro == 1){
            fillBoard();
            promptPlayerMove();
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
            if (gameIntro1 == 1){
                promptGameInstructions();
            }
            if (gameIntro1 == 0){
                fillBoard();
                promptPlayerMove();
            }
        }
    }

    public static void fillBoard(){
        for (String[] board:gameBoard) {
            Arrays.fill(board, EMPTY.getSymbol());
            System.out.println("            "+Arrays.toString(board));
        }

    }
    public static void promptPlayerMove(){
        for (int i = 0; i < 9 ; i++) {
            String playerName = players[TicTacToePlayer.getCurrentPlayer()].getName();
            System.out.printf("""
                    +----------------------------------------------------------+
                    | %s, pick a position to place a symbol on the board   
                    +----------------------------------------------------------+
                     """, playerName);
            int playerPosition = scanner.nextInt();
            if (playerPosition > 9) {
                System.err.println("number out of bound...");
                promptPlayerMove();
            } else {
                setPlayerPosition(playerPosition);
            }
        }

    }

    public static void setPlayerPosition(int move) {
        move -= 1;
        int row = move/3;
        int column = move%3;
        players[TicTacToePlayer.getCurrentPlayer()].setRowPosition(row);
        players[TicTacToePlayer.getCurrentPlayer()].setColumnPosition(column);
        setBoard();
        displayBoard();
        TicTacToePlayer.adjustCurrentPlayer();
        if (row == 0){
            System.out.printf("%s you win ", players[TicTacToePlayer.getCurrentPlayer()].getName());
        }

    }

    private static void setBoard() {
        int row = players[TicTacToePlayer.getCurrentPlayer()].getRowPosition();
        int column = players[TicTacToePlayer.getCurrentPlayer()].getColumnPosition();
        gameBoard[row][column] = players[TicTacToePlayer.getCurrentPlayer()].getSymbol();
    }
    public static void displayBoard(){
        for (String[] row: gameBoard) {
            System.out.println("            "+Arrays.toString(row));
        }
    }

    public static void setWinningPositions(int moves){
        for (int i = 0; i <gameBoard.length ; i++) {


        }

    }


}

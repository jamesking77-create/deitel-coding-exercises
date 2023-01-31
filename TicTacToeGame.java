package deitelChapters.chapter8.ticTacToe;



import java.util.Arrays;
import java.util.Scanner;

import static deitelChapters.chapter8.ticTacToe.TicTacCharacters.*;

public class TicTacToeGame {
    private static boolean isWon;
    private static int playCount;
    static final TicTacToePlayer [] players = new TicTacToePlayer[2];

    private static final Scanner scanner = new Scanner(System.in);

    private static final String[][] gameBoard = new String[3][3];

    public static void fillBoard(){
        for (String[] board:gameBoard) {
            Arrays.fill(board, EMPTY.getSymbol());
            System.out.println("            "+Arrays.toString(board));
        }

    }


    public static void setPlayerPosition(int move) {
        isWon = false;
        move -= 1;
        int row = move/3;
        int column = move%3;
        players[TicTacToePlayer.getCurrentPlayer()].setRowPosition(row);
        players[TicTacToePlayer.getCurrentPlayer()].setColumnPosition(column);
        setBoard();
        displayBoard();
        TicTacToePlayer.adjustCurrentPlayer();
    }

    private static void setBoard() {
        int row = players[TicTacToePlayer.getCurrentPlayer()].getRowPosition();
        int column = players[TicTacToePlayer.getCurrentPlayer()].getColumnPosition();
        if (!gameBoard[row][column].equals(EMPTY.getSymbol())){
            displayBoard();
            throw new IllegalArgumentException("Position already taken. Try again");
        }
        gameBoard[row][column] = players[TicTacToePlayer.getCurrentPlayer()].getSymbol();
    }
    public static void displayBoard(){
        for (String[] row: gameBoard) {
            System.out.println("            "+Arrays.toString(row));
        }
        setWinningPositions(gameBoard);
        checkTie();
            System.out.println();
    }



    private static void checkTie() {
        if (!isWon) {
            int count = 0;
            for (String[] row : gameBoard) {
                for (String square : row) {
                    if (!square.equals(EMPTY.getSymbol())) {
                        count++;
                    }
                }
            }
            if (count == 9) {
                isWon = true;
                printTieMessage();
            }
        }
    }

    private static void printTieMessage() {
        System.out.println("        Oops! It's a tie. Game Over!");
    }

    public static void setWinningPositions(String[][] moves) {

            if (moves[0][0].equals(X.getSymbol()) &&
                    moves[0][1].equals( X.getSymbol()) &&
                    (moves[0][2].equals( X.getSymbol()))){
                System.out.printf("%n%13s you win", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][0].equals(O.getSymbol()) &&
                    moves[0][1].equals( O.getSymbol()) &&
                    (moves[0][2].equals( O.getSymbol()))){
            System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
        }

            else if (moves[1][0].equals(X.getSymbol()) &&
                moves[1][1].equals( X.getSymbol()) &&
                (moves[1][2].equals( X.getSymbol()))){
            System.out.printf("%n%13s you win", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
        }
        else if (moves[1][0].equals(O.getSymbol()) &&
                moves[1][1].equals( O.getSymbol()) &&
                (moves[1][2].equals( O.getSymbol()))){
            System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
        }


        else if (moves[2][0].equals(X.getSymbol()) &&
                moves[2][1].equals( X.getSymbol()) &&
                (moves[2][2].equals( X.getSymbol()))){
            System.out.printf("%n%13s you win", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
        }
        else if (moves[2][0].equals(O.getSymbol()) &&
                moves[2][1].equals( O.getSymbol()) &&
                (moves[2][2].equals( O.getSymbol()))){
            System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
        }


            else if (moves[0][0].equals(O.getSymbol()) &&
                    moves[1][0].equals( O.getSymbol()) &&
                    (moves[2][0].equals( O.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][1].equals(O.getSymbol()) &&
                    moves[1][1].equals( O.getSymbol()) &&
                    (moves[2][1].equals( O.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][2].equals(O.getSymbol()) &&
                    moves[1][2].equals( O.getSymbol()) &&
                    (moves[2][2].equals( O.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][0].equals(X.getSymbol()) &&
                    moves[1][0].equals( X.getSymbol()) &&
                    (moves[2][0].equals( X.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][1].equals(X.getSymbol()) &&
                    moves[1][1].equals( X.getSymbol()) &&
                    (moves[2][1].equals( X.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][2].equals(X.getSymbol()) &&
                    moves[1][2].equals( X.getSymbol()) &&
                    (moves[2][2].equals( X.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }

            else if (moves[0][2].equals(X.getSymbol()) &&
                    moves[1][1].equals( X.getSymbol()) &&
                    (moves[2][0].equals( X.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][0].equals(X.getSymbol()) &&
                    moves[1][1].equals( X.getSymbol()) &&
                    (moves[2][2].equals( X.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }

            else if (moves[0][2].equals(O.getSymbol()) &&
                    moves[1][1].equals( O.getSymbol()) &&
                    (moves[2][0].equals( O.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
            else if (moves[0][0].equals(O.getSymbol()) &&
                    moves[1][1].equals( O.getSymbol()) &&
                    (moves[2][2].equals( O.getSymbol()))){
                System.out.printf("%n%13s you win!!!", players[TicTacToePlayer.getCurrentPlayer()].getName());
                isWon = true;
            }
        }

        public void itATie(){

        }
        public static boolean isWon(){
        return isWon;

        }
        public static void  resetPlayCount(){
        playCount = 0;
        }
    }



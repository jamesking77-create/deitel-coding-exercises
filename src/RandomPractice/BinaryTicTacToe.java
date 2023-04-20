package RandomPractice;

import java.util.Arrays;

public class BinaryTicTacToe {
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        board[0][0] = 'x';
        board[0][1] = 'o';
        board[0][2] = 'x';
        board[1][0] = 'o';
        board[1][1] = 'o';
        board[1][2] = 'x';
        board[2][0] = 'x';
        board[2][1] = 'o';
        board[2][2] = 'o';

        displayBinaryBoard(board);
    }

    private static void displayBinaryBoard(char[][] board) {
            for (int i = 0; i < board.length ; i++) {
                for (int j = 0; j <board[i].length ; j++) {
                    if (board[i][j] == 'x') board[i][j] = '1';
                    if (board[i][j] == 'o') board[i][j] = '0';
                }
                System.out.println(board[i]);
            }
        }
}


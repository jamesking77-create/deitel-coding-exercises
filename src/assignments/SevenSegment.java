package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegment {
    private static final int[][] seven_segment = new int[5][4];
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter any number from 1 - 9: ");
        int userInput = scanner.nextInt();
        switch (userInput){
            case 0 -> takeNumbers("11111011");
            case 1 -> takeNumbers("00001011");
            case 2 -> takeNumbers("11011101");
            case 3 -> takeNumbers("11110101");
            case 4 -> takeNumbers("01100111");
            case 5 -> takeNumbers("10110111");
            case 6 -> takeNumbers("10111111");
            case 7 -> takeNumbers("11100001");
            case 8 -> takeNumbers("11111111");
            case 9 -> takeNumbers("11110111");

        }
        showDisplay();
    }


    public static void showA(){
//        seven_segment[0][0] = 1;
        seven_segment[0][1] = 1;
        seven_segment[0][2] = 1;
//        seven_segment[0][3] = 1;
    }

    public static void showB(){
//        seven_segment[0][3] = 1;
        seven_segment[1][3] = 1;
//        seven_segment[2][3] = 1;

    }

    public static void showC(){
//        seven_segment[2][3] = 1;
        seven_segment[3][3] = 1;
//        seven_segment[4][3] = 1;

    }

    public static void showD(){
//        seven_segment[4][0] = 1;
        seven_segment[4][1] = 1;
        seven_segment[4][2] = 1;
//        seven_segment[4][3] = 1;

    }

    public static void showE(){
//        seven_segment[4][0] = 1;
        seven_segment[3][0] = 1;
//        seven_segment[2][0] = 1;

    }

    public static void showF(){
        seven_segment[2][0] = 1;
        seven_segment[2][1] = 1;
        seven_segment[2][2] = 1;
        seven_segment[2][3] = 1;

    }

    public static void showG(){
//        seven_segment[2][0] = 1;
        seven_segment[1][0] = 1;
//        seven_segment[0][0] = 1;

    }

    public static void takeNumbers(String number){
        if (number.length() == 8){
        for (int i = 0; i < number.length() ; i++) {

            if (number.charAt(i) == '1' && number.charAt(7) == '1'){
                switch (i){
                    case 0 -> showA();
                    case 1 ->  showB();
                    case 2 ->  showC();
                    case 3 -> showD();
                    case 4 ->  showE();
                    case 5 ->  showF();
                    case 6 ->  showG();
                }
            }
        }

        } else {
            System.err.println("Error enter 8 binaries!!!");
        }

    }

    public static void showDisplay(){
        for (int [] rows: seven_segment) {
            for (int values: rows) {
                if (values == 1){
                    System.out.print(" # ");
                }else {
                    System.out.print("   ");

                }
            }
            System.out.println();
        }
    }
}

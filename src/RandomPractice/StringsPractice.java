package RandomPractice;

import deitelChapters.chapterTwo.Account;

import java.util.Arrays;
import java.util.Scanner;

public class StringsPractice {
    public static void main(String[] args) {
        String words = "fresh boy";
        String word = " hello" + " james" +" king";
        words += word;
        double num = 98.7000;
        System.out.printf("%s\t%f",words , num);
        System.out.println();



//        int[] numbers = new int[4];
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter four different number: ");
//        for (int i = 0; i < numbers.length ; i++) {
//            int userInput = scanner.nextInt();
//            numbers[i] = userInput;
//        }
//        System.out.println(Arrays.toString(numbers).charAt(10));

// CREATING MULTIPLE OBJECT IN ONE LINE....
//        Account james, king, max = new Account(); new Account(); new Account();
        String name = "jame";
        System.out.append(name).append(" king");
        int number = 12;


    }
}
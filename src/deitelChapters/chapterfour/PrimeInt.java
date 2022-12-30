package deitelChapters.chapterfour;
import deitelChapters.chapterSix.PrimeNumber;

import java.util.Scanner;
public class PrimeInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = input.nextInt();
                PrimeNumber.primeNumber(userInput);



    }
}


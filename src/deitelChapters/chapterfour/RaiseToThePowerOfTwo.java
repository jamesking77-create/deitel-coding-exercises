package deitelChapters.chapterfour;

import java.util.Scanner;

public class RaiseToThePowerOfTwo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int count = 0;
        int result = 1;
               System.out.println("Please enter two numbers: ");
        int userInput = input.nextInt();
        int userInput2 = input.nextInt();
        if (userInput2 <= 0){ specialNegativeExponentialNumbers(userInput, userInput2)
        ;}
        else {
        while( count <= userInput2){
            result *= userInput;
            count++;
            if (count == userInput2)
        System.out.println(result);

    }}
}

    private static void specialNegativeExponentialNumbers(int userInput, int userInput2) {
       int count = 0;
       int result = 1;
        while( count <= 0){
            result *= userInput;
            count++;
                System.out.println(result);
    }
}}

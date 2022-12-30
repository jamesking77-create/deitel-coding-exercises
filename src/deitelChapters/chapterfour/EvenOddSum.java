package deitelChapters.chapterfour;
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        int count = 0;
        int numberOfEven = 0;
        int numberOfOdd = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        Scanner input = new Scanner(System.in);
        while ( count <= 100 ){
        System.out.println("Please enter any userInput, and enter any negative userInput to exit: ");
        int userInput = input.nextInt();
         if( userInput % 2 != 0) {
            numberOfOdd++;
            sumOfOdd = userInput +1;

        }  else {
                numberOfEven++;
                sumOfEven = userInput+ 1;

            }
            if ( userInput < 0){
                break;
            }

              }
        System.out.println(" number of odd number is: " + numberOfOdd);
        System.out.println(" number of even number is: " + numberOfEven);
        System.out.println(" sum of odd number is: " + sumOfOdd);
        System.out.println(" sum of even number is: " + sumOfEven);
    }


}


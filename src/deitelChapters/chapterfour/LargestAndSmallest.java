package deitelChapters.chapterfour;
import java.util.Scanner;


public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int stop = 0;
        System.out.print("Please enter a number: (enter 0 to quit): ");
        int userInput = input.nextInt();
        int largestNumber = userInput;
        int smallestNumber = userInput;
             while (userInput != stop){
                 System.out.print("please enter a number: (Enter  0 to quit ): ");
                 userInput = input.nextInt();
                 if ( userInput > largestNumber){
                     largestNumber = userInput;
                 }  if (userInput < smallestNumber) {
                     smallestNumber = userInput;
                 }
                    
             }
        System.out.println(largestNumber + " is the largest number..");
        System.out.println(smallestNumber + " is the smallest number..");


    }}


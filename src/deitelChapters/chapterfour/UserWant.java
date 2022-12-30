package deitelChapters.chapterfour;
import java.util.Scanner ;
public class UserWant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int  largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int yes = 1;
        int no = 2;
        while (count != 0) {
            System.out.println("Please enter a number: ");
            int userInput = input.nextInt();
            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            if (userInput < smallestNumber) {
                smallestNumber = userInput;
            }
            System.out.println("would you like to enter another number: " + yes + " yes " + no + " no");
            int userInput2 = input.nextInt();
            if (userInput2 == no) {
                System.out.println(largestNumber);
                System.out.println(smallestNumber);
                break;
            } while (userInput2 != no && userInput2 != yes){
                System.out.println("ERROR 401!!!");
                System.out.println("Please try again");
                System.out.println("would you like to enter another number: " + yes + " yes " + no + " no");
                int userInput3 = input.nextInt();
                if (userInput3 != no && userInput3 != yes){
                    System.out.println();
                 } else if (userInput2 == no && userInput2 == yes) {
                   } break;
            }

            count++;


            }
        }
}



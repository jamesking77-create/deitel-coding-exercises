package deitelChapters.chapterfour;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int luckyNumber = 7;
        int userInput = 0;
        while (count < 5) {
            System.out.print("Enter any number: ");
            userInput = input.nextInt();
            count+=1;

            if (userInput != luckyNumber) {
                System.out.println("Sorry please try again...");
            } else {
                System.out.println("you are a lucky winner!!!");
                break;
            }
            if (count == 5){
                System.out.println("Awww, sorry the lucky number is " + luckyNumber);
            }
        }




    }
}

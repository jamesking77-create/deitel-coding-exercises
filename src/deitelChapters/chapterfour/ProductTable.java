package deitelChapters.chapterfour;
import java.util.Scanner;


public class ProductTable {
    public static void main(String[] args) {
//        int i = 1;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int productNumber = input.nextInt();
//        int p = productNumber;
//       for (i = 1; i <= 12; i++){
//            System.out.println( productNumber + " times " + i + " is " + productNumber * i + " ");
//        }
        int count = 1;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = userInput.nextInt();
        while (count <=12){
            int p = number * count;
            System.out.println( number + " times " + count + " is " + p );
            count++;
        }

    }
}

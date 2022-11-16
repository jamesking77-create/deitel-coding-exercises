package chapterfour;
import java.util.Scanner;
public class PrimeInt {
    public static void main(String[] args) {

        int prime = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = input.nextInt();
        for ( int  count = 1; count <=userInput; count++){
            if(userInput % count == 0  ){
                prime++;
            }
        }if (prime == 2){
            System.out.println( userInput + " is a prime number");
        }else{
            System.out.println(userInput + " is not prime number");}

    }
}


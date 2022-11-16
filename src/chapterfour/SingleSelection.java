package chapterfour;
import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int usersInput = userInput.nextInt();
        if ( usersInput > 100){
            System.out.println("This is out of range....");
        } else { if (usersInput % 2 == 0){
                System.out.println("This is even thank you....");
            }else{
            System.out.println("This is odd biko try again thank you.....");
        }
        }
    }
}


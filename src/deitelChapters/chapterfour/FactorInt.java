package deitelChapters.chapterfour;
import java.util.Scanner;
public class FactorInt {
    public static void main(String[] args) {
        int factor = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = input.nextInt();
        for (  int count = 1; count <= userInput; count++){
            if(userInput % count == 0){
                factor = factor + 1 ;
            }
        }System.out.println(userInput +" has " + factor + " factors ");

}

}

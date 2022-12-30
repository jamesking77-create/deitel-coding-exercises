package deitelChapters.chapterTwo;

import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
  		int evenNumber = number%2;
		if ( evenNumber == 0){
		System.out.printf("%d Is an even number",number);
		}else{System.out.printf("%d Is an odd number", number);}
		





}

}
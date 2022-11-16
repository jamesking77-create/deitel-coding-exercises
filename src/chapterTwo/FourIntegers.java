package chapterTwo;

import java.util.Scanner;
public class FourIntegers{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input the first number: ");		
				int firstNumber = input.nextInt();

		System.out.println("Input the second number: ");		
				int secondNumber = input.nextInt();
		
		System.out.println("Input the third number: ");		
				int thirdNumber = input.nextInt();

		System.out.println("Input the fourth number: ");		
				int fourthNumber = input.nextInt();

		if (firstNumber == secondNumber && thirdNumber == fourthNumber ) {
		System.out.println(" Numbers are equal!");}else{
		System.out.println(" Numbers are not equal! ");
		}



}
}
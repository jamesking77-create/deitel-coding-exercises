package chapterTwo;

import java.util.Scanner;
public class SimilarInteger{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input the first number between 25 to 75: ");		
			int firstNumber = input.nextInt();

		System.out.println("Input the second number between 25 to 75: ");		
			int secondNumber = input.nextInt();
			int firstDigitFirstNumber = firstNumber / 10;
			int secondDigitFirstNumber = firstNumber % 10;
			int firstDigitSecondNumber = secondNumber / 10;
			int secondDigitSecondNumber = secondNumber  % 10;

			if (firstDigitFirstNumber==firstDigitSecondNumber || firstDigitFirstNumber== secondDigitSecondNumber ||secondDigitFirstNumber==firstDigitSecondNumber || secondDigitFirstNumber==secondDigitSecondNumber ){
			System.out.print("True");
			} else{
			System.out.print("False");
			}
			
			




}
 
}
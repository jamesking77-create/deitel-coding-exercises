package deitelChapters.chapterTwo;

import java.util.Scanner;
public class TwoIntegers{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input the first number: ");		
				int firstNumber = input.nextInt();

		System.out.println("Input the second number: ");		
			int secondNumber = input.nextInt();

		if (firstNumber>secondNumber){
			System.out.println(firstNumber);
}
		if (secondNumber>firstNumber){
			System.out.println(secondNumber);
}
		if (secondNumber==firstNumber){
			System.out.println("0");
}
		if (secondNumber%6 ==firstNumber%6){
			System.out.println(firstNumber);
}
}
}
package deitelChapters.chapterTwo;

import java.util.Scanner;
public class IntegerOperation{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input the first number: ");		
				int firstNumber = input.nextInt();
		System.out.println("Input the second number: ");		
				int secondNumber = input.nextInt();
				int sum = firstNumber + secondNumber;
				int sub = firstNumber - secondNumber;
				int mul = firstNumber * secondNumber;
				int div = firstNumber / secondNumber;
				int mod = firstNumber % secondNumber;
		System.out.printf("%d%s%d%s%d%n", firstNumber, " + ", secondNumber," = ", sum);
		System.out.printf("%d%s%d%s%d%n", firstNumber, " - ", secondNumber," = ", sub);
		System.out.printf("%d%s%d%s%d%n", firstNumber, " * ", secondNumber," = ", mul);
		System.out.printf("%d%s%d%s%d%n", firstNumber, " / ", secondNumber," = ", div);
		System.out.printf("%d%s%d%s%d%n", firstNumber, " mod ", secondNumber," = ", mod);

}
}
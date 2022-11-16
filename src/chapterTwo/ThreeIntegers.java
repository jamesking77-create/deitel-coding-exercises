package chapterTwo;

import java.util.Scanner;
public class ThreeIntegers{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input the first number: ");		
				double firstNumber = input.nextDouble();
		System.out.println("Input the second number: ");		
			double secondNumber = input.nextDouble();
		System.out.println("Input the third number: ");		
			double thirdNumber = input.nextDouble();
			double av = firstNumber + secondNumber + thirdNumber;
			double mn = av/3;
		System.out.print(mn);
}
}
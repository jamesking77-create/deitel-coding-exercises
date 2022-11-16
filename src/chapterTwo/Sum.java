package chapterTwo;

import java.util.Scanner;

public class Sum{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		System.out.print("Enter your first number: ");
			int number1 = input.nextInt();

		System.out.print("Enter your second number: ");
			int number2 = input.nextInt();

				int sum = number1 + number2;
					System.out.printf("sum is %d%n", sum);

}




}
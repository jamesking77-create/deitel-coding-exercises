package chapterTwo;

import java.util.Scanner;

public class   Summation{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Enter your integer:");
			int firstNumber = input.nextInt();

		System.out.print("Enter your integer:");
			int secondNumber = input.nextInt();

			int sum = firstNumber + secondNumber;
				System.out.printf("Sum is: %d%n", sum);


}

}
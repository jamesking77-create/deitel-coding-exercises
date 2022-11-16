package chapterTwo;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your integer:");
			int firstNumber = input.nextInt();
			System.out.print("Enter your integer:");
				int secondNumber = input.nextInt();
				int summation = firstNumber +  secondNumber;
				int multiplication = secondNumber * firstNumber;
				int division = secondNumber /  firstNumber;
			System.out.printf("%d%n",summation);
				System.out.printf("%d%n", division);
					System.out.printf("%d%n", multiplication);
	 	

}
}
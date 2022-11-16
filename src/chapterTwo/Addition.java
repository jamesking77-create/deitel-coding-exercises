package chapterTwo;

import java.util.Scanner;

public class Addition{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
			
		System.out.println("please enter your first number:");
			int firstNumber = input.nextInt();
				System.out.println("please enter your second number:");
			int secondNumber = input.nextInt();

				int sum = firstNumber + secondNumber;
 				System.out.print (sum);
	}

}
package chapterTwo;

import java.util.Scanner;
	public class IntegerDistance{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
			int firstNumber = input.nextInt();
		System.out.println("Enter your number: ");
			int secondNumber = input.nextInt();
			int sum = firstNumber + secondNumber;
			int dif = firstNumber - secondNumber;
			int prd = firstNumber * secondNumber;
			int avg = sum / 2;
			int dis = firstNumber - secondNumber;
		System.out.println("Sum of two integer: " + sum);
		System.out.println("Difference of two integer: " + dif);
		System.out.println("Prosuct of two integer: " + prd);
		System.out.println("Average of two integer: " + avg);
		System.out.println("Distance of two integer: " + dis);
			if (firstNumber>secondNumber){
			System.out.println("Max integer: " + firstNumber + " \nMin integer: " + secondNumber);}else{
			System.out.println("Max integer: " + secondNumber + "\n Max integer: " + firstNumber);
			}
				
				
				
				
}
}
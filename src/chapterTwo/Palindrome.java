package chapterTwo;

import java.util.Scanner;
public class Palindrome{
		public static void main(String[] args){
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter a three digit number: ");
			int number = input.nextInt();
			int numberDigit1 = number/1000%100;
			int numberDigit2 = number/100 % 10;
			int numberDigit3 = number%10;
			
		if (numberDigit2==numberDigit3){
		System.out.printf("%d is a Palindrome", number);
		}else{
		System.out.println("This is not a palindrome");
		}



}

}
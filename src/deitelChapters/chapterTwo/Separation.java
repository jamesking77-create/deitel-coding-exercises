package deitelChapters.chapterTwo;

import java.util.Scanner;
public class Separation {
	public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
			int number;
			int firstDigit;
			int secondDigit;
			int thirdDigit;
			int fourthDigit;
			int fifthDigit;

			System.out.println("Enter a  number: ");
			number = Scanner.nextInt();
			
		firstDigit = number / 10000 % 10; 
		 secondDigit = number / 1000 % 10;
		  thirdDigit = number / 100 % 10;
	           fourthDigit = number / 10 % 10;
		  fifthDigit = number % 10;
				
			System.out.printf("%d %d %d %d %d",firstDigit, secondDigit,thirdDigit,fourthDigit, fifthDigit);  

				
}
}
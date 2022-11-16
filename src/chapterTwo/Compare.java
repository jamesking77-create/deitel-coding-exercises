package chapterTwo;

import java.util.Scanner;

public class Compare{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
			System.out.print("Enter your first integer:");
				int number1 = input.nextInt();

			System.out.print("Enter your second integer:");
				int number2 = input.nextInt();

		if (number1==number2){
			System.out.printf("%d==%d%n", number1, number2);
}

		if (number1!=number2){
			System.out.printf("%d!=%d%n", number1,number2);
}

		if (number1<=number2){
			System.out.printf("%d<=%d%n", number1, number2);
}

		if (number1>=number2){
			System.out.printf("%d>=%d%n", number1, number2);
}	







	}

}
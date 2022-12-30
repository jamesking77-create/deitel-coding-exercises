package deitelChapters.chapterTwo;

import java.util.Scanner;

public class Comparing{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
			System.out.print("Enter your integer: ");
			int number1 = input.nextInt();
			int numberSquare = number1 * number1;
				System.out.println(numberSquare);
	
		if (numberSquare == 100){
		System.out.printf("%d%n == 100 ", numberSquare);
}

		if (numberSquare != 100){
		System.out.printf("%d != 100\n",numberSquare);
}

		if (numberSquare <= 100){
		System.out.printf("%d <= 100",numberSquare);
}

		if (numberSquare >= 100){
		System.out.printf("%d >= 100",numberSquare);
}
}
}
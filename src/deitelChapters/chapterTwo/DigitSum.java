package deitelChapters.chapterTwo;

import java.util.Scanner;
public class DigitSum{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a number between 0 and 1000: ");
			int number = input.nextInt();
			int nr = number % 10;
			int nd = number/ 10;
                        int nSum = nr + nd;
				System.out.printf("The sum of the digits is: %d ", nSum );

}
}
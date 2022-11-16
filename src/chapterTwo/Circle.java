package chapterTwo;

import java.util.Scanner;

public class Circle{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
			System.out.println("Enter your radius: ");
			int r = input.nextInt();
			double pi = 3.14159;
		System.out.printf("The diameter of the cicrcle = %d%n", 2*r );
		System.out.printf("The circumference of the cirle is = %.6f\n", 2*pi*r);
		System.out.printf("The area of the cirle is = %.6f", pi*r*r);
}
}
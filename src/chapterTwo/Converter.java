package chapterTwo;

import java.util.Scanner;
public class Converter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.print("Please enter your number in pound: ");
		double pound = input.nextDouble();
			double kilo = pound * 0.454;
	System.out.printf("%.3f pounds is %.3f kilograms", pound, kilo); 


}
}
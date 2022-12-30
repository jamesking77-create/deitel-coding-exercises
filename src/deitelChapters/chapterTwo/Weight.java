package deitelChapters.chapterTwo;

import java.util.Scanner;
	public class Weight{
		public static void main(String[] args){
			Scanner input = new Scanner (System.in);
		System.out.println("Enter your weight in kilograms: ");
			double weight1 = input.nextDouble();
			
		System.out.println("Enter your height in meters: ");
			double height1 = input.nextDouble();
					double heightMeter = weight1/ height1 * height1;

			System.out.println("Your BMI is: " + heightMeter);
		
			
}
}
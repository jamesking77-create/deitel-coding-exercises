package chapterTwo;

import java.util.Scanner;
public class Physics{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.print("Please enter your starting velocity number in meters: ");
		double v0 = input.nextDouble();
	System.out.print("Please enter your ending velocity number in meters: ");
		double v1 = input.nextDouble();
	System.out.print("Please enter the time span  number in seconds: ");
		double t = input.nextDouble();
				double a = (v1-v0)/t;
				System.out.printf("The average acceleration is %.3f " , a); 


}
}
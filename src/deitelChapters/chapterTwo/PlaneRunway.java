package deitelChapters.chapterTwo;

import java.util.Scanner;
public class PlaneRunway{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
			System.out.println("Enter  acceleration: ");
		double a = input.nextDouble();
			System.out.println("Enter  speed: ");
		double v = input.nextDouble();
			double aa = a * a;
			double vv = v + v;
			double l = (vv/aa);
		System.out.printf("The minimum runway length for this airplane is %.3f ", l);


		
}
}
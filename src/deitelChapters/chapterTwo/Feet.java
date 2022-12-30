package deitelChapters.chapterTwo;

import java.util.Scanner;
public class Feet{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.print("Please enter your number in feet: ");
		double feet = input.nextDouble();
			double meter = feet * 0.305;
	System.out.printf( "%.1f feet is %1f meters ",feet,meter); 


}
}
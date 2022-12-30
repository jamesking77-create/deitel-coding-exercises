package deitelChapters.chapterTwo;

import java.util.Scanner;
	public class Hexagon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input the length of a side of the hexagon: ");
		double length = input.nextDouble();
		double s = length * length;
		double tanPi = 0.5776;
		double area = (6*s)/(4*0.5776);
		System.out.println("The area of the hexagon is: " + area);
}
}
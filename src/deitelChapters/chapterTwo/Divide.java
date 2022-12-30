package deitelChapters.chapterTwo;

import java.util.Scanner;
public class Divide{
	public static  void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your integer: ");
			int firstInteger = input.nextInt();
		System.out.println("Enter your integer: ");
			int secondInteger = input.nextInt();
		int one = firstInteger*3;
		int two = secondInteger*2;
			if (one==two){
		System.out.printf("Divisible.%d s%d", one, two);
}
			if (one!=two){
		System.out.printf("Not divisible.%d %d", one,   two);
}
}
}

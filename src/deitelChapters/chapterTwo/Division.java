package deitelChapters.chapterTwo;

import java.util.Scanner;

public class Division{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Enter your integer:");
				int number = input.nextInt();
		if (3 / number == number){
		System.out.println("Divisible by 3..");
		}else{
			System.out.println("Not divisible by 3..");

}
}
}
package chapterTwo;

import java.util.Scanner;
public class NumberSwitch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 0 or 1");
			int number = input.nextInt();

		if(number==0){
		System.out.println("1");
		}else{
		System.out.println("0");
		}
	
}
}
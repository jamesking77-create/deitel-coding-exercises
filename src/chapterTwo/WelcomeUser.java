package chapterTwo;

import java.util.Scanner;
public class WelcomeUser{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Please enter your name: ");
	String userName = input.nextLine();
			System.out.printf("Welcome %s.",userName);

}

}
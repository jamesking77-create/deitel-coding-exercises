package chapterTwo;

import java.util.Scanner;
public class Minutes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.print("Please enter an  amount of minutes: ");
		int minute = input.nextInt();
			int hours = minute / 60;
			int days = hours / 24;
			int years = days/365;
			int remainingDays= days % 365;
	System.out.printf("%d minutes is approximately %d years and %d days", minute, years, remainingDays); 




}
}
package deitelChapters.chapterTwo;

import java.util.Scanner;
  public class AccountTest{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
			Account kingAccount = new Account ();
			System.out.printf("the initial name is %s%n%n", kingAccount.getName());
			System.out.println ("Please enter your name");
			String theName = input.nextLine();
			kingAccount.setName(theName);
			System.out.println();
		System.out.printf("The account name is %n%s%n", kingAccount.getName());
	
		
}

}
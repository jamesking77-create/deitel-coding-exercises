package chapterTwo;

import java.util.Scanner;

public class IntegersCheck{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);

	System.out.print("Enter your first integer: ");
		int firstInteger = input.nextInt();

	System.out.print("Enter your second integer: ");
		int secondInteger = input.nextInt();

	System.out.print("Enter your third integer: ");
		int thirdInteger = input.nextInt();

	System.out.print("Enter your fourth integer: ");
		int fourthInteger = input.nextInt();

	System.out.print("Enter your fifth integer: ");
		int fifthInteger = input.nextInt();

		if (firstInteger>=secondInteger && firstInteger>=thirdInteger && firstInteger>=fourthInteger && firstInteger>=fifthInteger){
			System.out.print(firstInteger + "is the highest integer.");
}
		if (firstInteger<=secondInteger && firstInteger<=thirdInteger && firstInteger<=fourthInteger && firstInteger<=fifthInteger){
			System.out.print(firstInteger + "is the lowest integer.");
}

		if (secondInteger>=firstInteger && secondInteger>=thirdInteger && secondInteger>=fourthInteger && secondInteger>=fifthInteger){
			System.out.print(secondInteger + "is the highest integer.");
}
		
		if (secondInteger<=firstInteger && secondInteger<=thirdInteger && secondInteger<=fourthInteger && secondInteger<=fifthInteger){
			System.out.print(secondInteger + "is the lowest integer.");
}		

		if (thirdInteger>=firstInteger && thirdInteger>=secondInteger && thirdInteger>=fourthInteger && thirdInteger>=fifthInteger){
			System.out.print(thirdInteger + "is the highest integer.");
}
		if (thirdInteger<=firstInteger && thirdInteger<=secondInteger && thirdInteger<=fourthInteger && thirdInteger<=fifthInteger){
			System.out.print(thirdInteger + "is the lowest integer.");
}
		if (fourthInteger>=firstInteger && fourthInteger>=secondInteger && fourthInteger>=thirdInteger && fourthInteger>=fifthInteger){
			System.out.print(fourthInteger + "is the highest integer.");
}
		if (fourthInteger<=firstInteger && fourthInteger<=secondInteger && fourthInteger<=thirdInteger && fourthInteger<=fifthInteger){
			System.out.print(fourthInteger + "is the lowest integer.");
}
		if (fifthInteger>=firstInteger && fifthInteger>=secondInteger && fifthInteger>=thirdInteger && fifthInteger>=fourthInteger){
			System.out.print(fifthInteger + "is the highest integer.");
}
		if (fifthInteger<=firstInteger && fifthInteger<=secondInteger && fifthInteger<=thirdInteger && fifthInteger<=fourthInteger){
			System.out.print(fifthInteger + "is the lowest integer.");
}
}
}
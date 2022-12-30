package deitelChapters.chapterTwo;

import java.util.Scanner;

public class Average{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
			System.out.print("Enter your integer: ");
			int num1 = input.nextInt();
			System.out.print("Enter your integer: ");
			int num2 = input.nextInt();
			System.out.print("Enter your integer: ");
			int num3 = input.nextInt();
			int sum = num1 + num2 + num3;
			System.out.printf("%d%n",sum);
			int dev = sum/3;
			System.out.printf("%d%n",dev);
			int mul = num1 * num2 * num3;
			System.out.printf("%d%n", mul);

	if (num1>=num2 && num1>=num3 ){
		System.out.println(num1 + " is max");
}

	if (num1<=num2 && num1<=num3 ){
		System.out.println(num1 + " is less");
}

	if (num2>=num1 && num2>=num3 ){
		System.out.println(num2 + " is max");
}

	if (num2<=num1 && num2<=num3 ){
		System.out.println(num2 + " is less");
}

	if (num3>=num1 && num3>=num2 ){
		System.out.println(num3 + " is max");
}

	if (num3<=num1 && num3<=num2 ){
		System.out.println(num3 + " is less");
}
									
}
}

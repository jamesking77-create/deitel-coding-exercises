package afterClassPractice;
import java.util.Arrays;
import java.util.Scanner;

 class ArrayIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the length of your array: ");
            int user_input = input.nextInt();
        int [] number = new int [user_input];
        System.out.println("input the elements of the array: ");
        for (int i = 0; i < number.length; i++){
            number [i] = input.nextInt();
            int sum = number[user_input-1] + 1;
            number[user_input-1] = sum;
            if (sum > 9){
                number[user_input-1] = 0;
                sum = number[user_input - 2] + 1;
                number[user_input - 2] = sum;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}




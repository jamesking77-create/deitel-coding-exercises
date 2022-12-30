package deitelChapters.chapterSix;


import java.util.Arrays;
import java.util.Scanner;

public class Array_class_work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the length of your array: ");
        int array_length = input.nextInt();
        int[] number = new int[array_length];
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.print("please enter a number into your array index " + i + ": ");
            number[i] = input.nextInt();
            sum += number[i];
            if (sum == 10) {
                System.out.println(sum);
            }
        }
        System.out.println(Arrays.toString(number));
        for (int digits : number) {
            if (digits + digits == 10) {
                System.out.printf(" %d + %d = 10", digits, digits);
            }
        }
    }
}







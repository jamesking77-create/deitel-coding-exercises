package deitelChapters.chapter7;

import java.util.Scanner;

public class StudentGradeBarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score section length: ");
        int userInput = input.nextInt();
        int [] grades = new int[userInput];
        System.out.println("Enter how many student made each section: ");
        for (int index = 0; index < grades.length ; index++) {
            userInput = input.nextInt();
            grades[index] = userInput;
            if (index == grades.length - 1){
                System.out.printf("%5d: ", 100);
            }else{
            System.out.printf("%4d - %d: ", index * 10, index * 10 + 9  );
            }
            for (int j = 0; j < grades[index]; j++) {
                System.out.print("*");
            }
            System.out.println();
             }
    }
}

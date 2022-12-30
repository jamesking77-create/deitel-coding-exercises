package deitelChapters.chapter7;

import java.util.Scanner;

public class GradesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the numbers of student: ");
        int userInput1 = scanner.nextInt();
        int[] gradesArray = new int [userInput1];
        System.out.println("Please enter the student scores: ");
        for (int i = 0; i < gradesArray.length; i++) {
         int  userInput2  = scanner.nextInt();
            gradesArray[i] = userInput2;
        }

        GradeBook gradebook = new GradeBook("101 java how to program", gradesArray );
        System.out.printf("Welcome to grade book %s%n",gradebook.getCourse_name());
        gradebook.processGrades();

    }
}

package assignments;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StudentGradeBookTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do you have: ");
        int userInput = scanner.nextInt();
        System.out.print("How many subject do they offer: ");
        int userInput2 = scanner.nextInt();
        int [][] gradeBook = new int[userInput][userInput2];
        for (int student = 0; student < gradeBook.length ; student++) {
            for (int subject = 0; subject < gradeBook[student].length ; subject++) {
                System.out.printf("Enter score for student %d: %n", student + 1);
                System.out.printf("Enter score for subject %d: ", subject + 1);
                int userInput3 = scanner.nextInt();
                while (userInput3 < 0 ||userInput3 > 100){
                    System.err.println("invalid score!!!");
                    System.out.println();
                    System.out.printf("Enter score for student %d: %n", student + 1);
                    System.out.printf("Enter score for subject %d: ", subject + 1);
                    userInput3 = scanner.nextInt();

                }
//                System.out.println();
//                System.out.print("Storing");
//                for (int count = 0; count < 2; count++) {
//                    TimeUnit.SECONDS.sleep(1);
//                    System.out.print(".");
//                }
//                System.out.println();
//                System.out.println("Saved successfully ");
                System.out.println();
                gradeBook[student][subject] = userInput3;

            }
        }
//        System.out.print("PREPARING GRADE BOOK");
//        for (int count = 0; count < 2; count++) {
//            TimeUnit.SECONDS.sleep(1);
//            System.out.print(">>");
//        }
        System.out.println();
        StudentGradeBook grades = new StudentGradeBook(gradeBook,"SEMICOLON YEAR 1 EXAM...");
        System.out.println(grades.getCourseName());
        grades.StudentGradeProcess();
    }
 }

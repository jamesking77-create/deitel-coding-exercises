package assignments;

import java.util.Arrays;

public class StudentGradeBook {
    private final int [][] studentGrades;
    private String courseName;

    public StudentGradeBook(int[][] studentGrades, String courseName) {
        this.studentGrades = studentGrades;
        this.courseName = courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void StudentGradeProcess(){
        outputStudentGrade();

    }
    public int getMaximum(){
       int maximum =  studentGrades[0][0];
        for (int [] studentGrade:studentGrades) {
            for (int grade: studentGrade) {
                if (grade > maximum){
                    maximum = grade;
                }
            }
        }
        return maximum;
    }
    public  int getMinimum(){
        int minimum = studentGrades [0][0];
        for (int[] studentGrade: studentGrades) {
            for (int grade: studentGrade) {
                if (grade < minimum){
                    minimum = grade;
                }
            }
        }
        return minimum;
    }
    public int getTotal(int[] studentGrade){
        int total = 0;
            for (int grade: studentGrade) {
                total += grade;
            }
        return total;
    }
    public double getAverage(int[] studentGrade){
        double total = 0;
            for (int grade: studentGrade) {
                total+=grade;
            }
        return total / studentGrades.length;
    }
    public void outputStudentGrade(){
        System.out.printf("The grades are: %n%n");
        System.out.println("================================================================");
        System.out.print("STUDENT   ");
        for (int subject = 0; subject < studentGrades[0].length ; subject++) {
            System.out.printf("SUB%1d   ",subject + 1);
        }
        System.out.println("TOT     AVE   POS");
        System.out.println("================================================================");

        for (int student = 0; student < studentGrades.length ; student++) {
            System.out.printf("Student%2d", student + 1);
            for (int subject:studentGrades[student]) {
                System.out.printf("    %d", subject);
            }
            int total = getTotal(studentGrades[student]);
            System.out.printf("     %d", total);
            double average = getAverage(studentGrades[student]);
            System.out.printf("%9.2f   ", average);

       }
        System.out.println("================================================================");
        System.out.println("================================================================");
    }
}

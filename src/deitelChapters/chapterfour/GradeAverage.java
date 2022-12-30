package deitelChapters.chapterfour;



import java.util.Scanner;

class GradeAverage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grades gradeScore = new Grades();
        double sum = 0;
        int gradeCounter = 1;
        while(gradeCounter <= 10) {
            System.out.println(" Enter your " + gradeCounter + gradeScore.grader(gradeCounter) + ": ");
            int grade = input.nextInt();
            sum = sum + grade;
            gradeCounter++;
//            if (grade > 0 &&  grade <= 100) System.out.println(" Enter your " + gradeCounter +
//                    gradeScore.grader(gradeCounter) + ": ");
//            else System.out.println("Enter a correct grade");
        }
        double average = sum / 10;
        System.out.println("The total sum of your grade is " + sum);
        System.out.println("Your grade average is  " + average);
}
}
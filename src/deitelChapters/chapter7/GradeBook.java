package deitelChapters.chapter7;

public class GradeBook {
    private final String course_name;
    private final int[] grades;

    public GradeBook(String course_name, int[] grades) {
        this.course_name = course_name;
        this.grades = grades;
    }

    public String getCourse_name() {
        return course_name;
    }

    public  void processGrades() {
        outputGrade();
        System.out.printf("The highest grade is: %d%nThe lowest grade is: %d%nThe total grade is: %d%n", getMaximum(),
                getMinimum(), gradeTotal());
        System.out.printf("The grades average is: %.2f%n", gradeAverage());
        gradeFrequency();

    }
    public  int getMinimum() {
        int low_grade = grades[0];
        for (int grade : grades) {
            if (grade < low_grade) {
                low_grade = grade;
            }
        }
        return low_grade;
    }

    public  int getMaximum() {
        int high_grade = grades[0];
        for (int grade : grades) {
            if (grade > high_grade) {
                high_grade = grade;
            }
        }
        return high_grade;
    }
    public int gradeTotal(){
        int  total = 0;
        for (int grade:grades) {
            total += grade;
        }return total;
    }

    public  double gradeAverage() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public void outputGrade() {
        System.out.printf("The grades are: %n%n");
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student: %d%5d%n", i + 1, grades[i]);
        }
    }
    public void gradeFrequency(){
        System.out.println("Grade frequency: ");
        int[] frequency = new int[grades.length];
        for (int grade : grades) {
            ++frequency[grade / 10];
        }
        for (int index = 0; index < frequency.length ; index++) {
            if (index == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%4d - %d: ", index * 10, index * 10 + 9  );
            }
            for (int j = 0; j < frequency[index]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}







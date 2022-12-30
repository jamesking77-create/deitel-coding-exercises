package deitelChapters.chapterFive;

public class RecursionSample {
    public static void main(String[] args) {
        printRightAngleTriangle(5);
        printLeftAngleTriangle(5 );
    }
    private static void printRightAngleTriangle(int number){
        if (number < 1){
            return;
        }
        number = number - 1;
//        this next line is the recursive call where the method calls itself...
        printRightAngleTriangle(number);
        for (int index = 0; index < number; index ++){
            System.out.print("* ");
        }
        System.out.println();
    }
    private static void printLeftAngleTriangle(int number){
        if (number < 1){
            return;
        }
        number = number - 1;
        printLeftAngleTriangle(number);
        for (int i = number; i < 4; i++){
            System.out.print(" ");
        }
        for (int i = 0; i < number; i++){
        System.out.print("o");
    }
        System.out.println();
}}

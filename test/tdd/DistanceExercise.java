package tdd;

import java.util.Scanner;

public class DistanceExercise {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your co-ordinates: ");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        System.out.println(isPerpendicular(x1, x2, y1, y2));
    }
        public static  boolean isPerpendicular( int x1, int x2, int y1, int y2){
            return x1 == y1 || x2 == y2;

        }

}

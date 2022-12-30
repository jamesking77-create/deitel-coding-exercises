package deitelChapters.chapterfour;

import java.util.Scanner;

public class AgeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

//        if (age<20) System.out.println("you be pikin");
//        else if (age>=21 && age <30) System.out.println("you suppose dey hustle");
//        else if ( age >=31 && age < 40) System.out.println("you be agba");
//        else System.out.println(age);
        switch (age) {
            case 10, 15, 20:System.out.println("you be pikin");

            case  30, 45, 50:
                System.out.println("you be adult");
                break;

        }
    }
}


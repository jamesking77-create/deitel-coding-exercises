package deitelChapters.chapterfour;

import java.util.Scanner;

public class Footballers {
    public static void main(String[] args) {
        Scanner football = new Scanner(System.in);
        System.out.println("""
                1. Goal keeper 
                2. Defender 
                3. Defender
                4. Defender
                5. Defender
                6. Mid fielder
                7. Mid fielder
                8. Mid fielder
                9. Striker
                10. Striker
                11. Striker
                """);
        System.out.println("Pick an option: ");
        int input = football.nextInt();
        switch (input){
            case 1:
                System.out.println("Goal keeper ");
                break;
            case 2, 3, 4, 5:
                System.out.println("Defender ");
                break;
                case 6, 7, 8:
                System.out.println("Mid fielder");
                break;
            case  9, 10, 11:
                System.out.println(" Striker");
                break;
                default:
                System.out.println("not a footballer");

        }
    }
}

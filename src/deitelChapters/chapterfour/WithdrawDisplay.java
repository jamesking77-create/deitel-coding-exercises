package deitelChapters.chapterfour;

import java.util.Scanner;

public class WithdrawDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                """);
        System.out.println("Pick an option: ");
        int input = scanner.nextInt();
              switch(input){
            case 1 , 2, 3, 4, 5:
                System.out.println("take your money ");
                break;
            default:
                System.out.println("money don finish");
        }

    }
}

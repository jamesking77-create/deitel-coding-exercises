package deitelChapters.chapterSix;
//You roll two dice. Each die has six faces, which contain one, two, three, four, five and
//        six spots, respectively. After the dice have come to rest, the sum of the spots on the two
//        upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
//        is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
//        sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
//        you must continue rolling the dice until you “make your point” (i.e., roll that same
//        point value). You lose by rolling a 7 before making your point.

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumber = new SecureRandom();
    public enum Status {WIN, LOST, CONTINUE}
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int points = 0;
        Status gamesStatus;
        int sumOfDice = rollDice();
        switch (sumOfDice){
            case SEVEN, YO_LEVEN ->{ gamesStatus = Status.WIN; System.out.print("YOU WiN!!!");     System.out.print(">");
                System.out.print(">");
                System.out.print(">");}
            case SNAKE_EYES, TREY, BOX_CARS ->  {gamesStatus = Status.LOST;System.out.print("YOU HAVE LOST!!!");    System.out.print(">");
                System.out.print(">");
                System.out.print(">");}
            default -> {
                gamesStatus = Status.CONTINUE;
                   points = sumOfDice;
                System.out.printf("\npoint is %d%n", points);
            }
        }
        while (gamesStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if (sumOfDice == SEVEN){
               gamesStatus = Status.LOST;
            } else if (sumOfDice == points) {
                gamesStatus = Status.WIN;
            } else if (sumOfDice == points - 1) {
                System.out.println("YOU ARE ALMOST THERE...");
            }
            if (gamesStatus == Status.WIN){
                System.out.print("YOU WIN!!!");
                System.out.print(">");
                System.out.print(">");
                System.out.print(">");

            } else if (gamesStatus == Status.LOST) {
                System.out.print("YOU HAVE LOST!!!");
                System.out.print(">");
                System.out.print(">");
                System.out.print(">");
            }
        }

    }

    public static int rollDice() {
        int firstDie = 1+ randomNumber.nextInt(6);
        int secondDie = 1 + randomNumber.nextInt(6);
        int sum = firstDie + secondDie;
        System.out.printf("you rolled %d + %d = %d%n",firstDie, secondDie, sum);
        return sum;
    }
}

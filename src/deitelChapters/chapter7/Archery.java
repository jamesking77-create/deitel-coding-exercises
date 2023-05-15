package deitelChapters.chapter7;


import java.util.concurrent.TimeUnit;

public class Archery {
    public static void main(String[] args) throws InterruptedException {
        int[][] archery = new int[3][4];
        Archers.archersRound(archery);


        Archers.registerPlayer();
        for (int i = 0; i < 3; i++) {
                System.out.printf("Round (%d) loading", i + 1);
                for (int k = 0; k < 3; k++) {
                    System.out.print("..");
                    TimeUnit.SECONDS.sleep(1);
                }
            System.out.println();
            Archers.playGame();
            System.out.println();
        }
        System.out.print("Player Totals loading");
        for (int k = 0; k < 3; k++) {
            System.out.print("..");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        Archers.displayArchersResult();
    }
}
package deitelChapters.chapter7;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Archers {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Player[] players = new Player[4];

    public static void registerPlayer() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter player " + (i + 1) + " name: ");
            String playerName = scanner.nextLine();
            players[i] = new Player(playerName);
        }
    }

    public static void playGame() {
        for (Player player : players) {
            SecureRandom secureRandom = new SecureRandom();
            int point = 1 + secureRandom.nextInt(10);
            player.setScores(point);
            System.out.printf("""
                    =============================
                    %s got %d points
                    =============================
                    """, player.getName(), point);
        }

    }

    public static void displayArchersResult() throws InterruptedException {
        System.out.printf("""
                =========================================================
                %-15s%-11s%-11s%-11s%s%n""", "Player Name", "1st shot", "2nd shot", "3rd shot", "Total");
        for (Player player : players) {
            System.out.printf("""
                    =========================================================
                    %-15s""", player.getName());
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-11d", player.getScores(j));
            }
            System.out.print(player.getTotalShot());
            System.out.println();
        }
        System.out.println("=========================================================");
        System.out.println();
        System.out.print("Analysing");
        for (int k = 0; k < 3; k++) {
            System.out.print("..");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        displayWinner();
    }
    private static void displayWinner(){
        int highestScore =  0;
        int winnerIndex = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getTotalShot() > highestScore){
                highestScore = players[i].getTotalShot();
                winnerIndex = i;
            }
        }
        System.out.printf("%s wins by %d shot", players[winnerIndex].getName(), highestScore);
    }

    public static void archersRound(int[][] players) throws InterruptedException {

        int firstPlayerTotal = 0;
        int secondPlayerTotal = 0;
        int thirdPlayerTotal = 0;
        int forthPlayerTotal = 0;

        String[] playerName = new String[4];
        for (int i = 0; i < players[0].length; i++) {
            System.out.printf("player %d Enter your name: ", i + 1);
            playerName[i] = scanner.nextLine();
        }
        System.out.println();


        SecureRandom randomShot = new SecureRandom();
        for (int i = 0; i < players.length; i++) {

            System.out.printf("Round (%d) loading", i + 1);
            for (int k = 0; k < 3; k++) {
                System.out.print("..");
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println();
            for (int l = 0; l < players[i].length; l++) {
                int random = 1 + randomShot.nextInt(10);
                System.out.println("============================");
                System.out.printf("%s got %d points %n", playerName[l], random);
                players[i][l] = random;
            }

            System.out.println("============================");
            System.out.println();
            firstPlayerTotal += players[i][0];
            secondPlayerTotal += players[i][1];
            thirdPlayerTotal += players[i][2];
            forthPlayerTotal += players[i][3];
        }
        System.out.print("Player Totals loading");
        for (int k = 0; k < 3; k++) {
            System.out.print("..");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        System.out.println("=========================================");
        for (int i = 0; i < players[0].length; i++) {
            System.out.printf("%s       ", playerName[i]);
        }
        System.out.printf("%n=========================================%n");
        System.out.printf("%-12d%-12d%-12d%-12d%n", firstPlayerTotal, secondPlayerTotal, thirdPlayerTotal, forthPlayerTotal);
        System.out.print("=========================================");
        System.out.println();
        System.out.print("Analysing");
        for (int k = 0; k < 3; k++) {
            System.out.print("..");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        Integer[] playersTotal = new Integer[4];
        playersTotal[0] = firstPlayerTotal;
        playersTotal[1] = secondPlayerTotal;
        playersTotal[2] = thirdPlayerTotal;
        playersTotal[3] = forthPlayerTotal;
        Arrays.sort(playersTotal,Collections.reverseOrder());
        for (int i = 0; i < players[i].length ; i++) {
            System.out.printf("%s wins with %d shots points", playerName[0], playersTotal[0]);
        }




    }

}

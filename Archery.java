package deitelChapters.chapter7;


public class Archery {
    public static void main(String[] args) throws InterruptedException {
//        int[][] archery = new int[3][4];
//        Archers.archersRound(archery);
        Archers.registerPlayer();
        for (int i = 0; i < 3; i++) {
            Archers.playGame();
        }
        Archers.displayArchersResult();
    }
}
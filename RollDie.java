package deitelChapters.chapter7;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];
        for (long i = 1; i <= 60_000_000 ; i++) {
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%15s%n", "face", "frequency");
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%d%15d%n", face, frequency[face]);
        }
    }
}

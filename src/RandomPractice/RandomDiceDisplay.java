package RandomPractice;

import java.security.SecureRandom;

public class RandomDiceDisplay {
    public static void main(String[] args) {
        System.out.println(randomLinesOfInteger(7));

    }
    public static int randomLinesOfInteger(int faces) {
        SecureRandom randomNumbers = new SecureRandom();
        for (int i = 1; i <= 20; i++) {
           int face = 1 + randomNumbers.nextInt(faces);
            System.out.printf("%d ", face);
            if (i % 5 == 0) System.out.println();
        }
        return faces;
}}

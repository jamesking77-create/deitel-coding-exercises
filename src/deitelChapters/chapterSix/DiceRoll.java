package deitelChapters.chapterSix;

import java.security.SecureRandom;

public class DiceRoll {
    public static void main(String[] args) {
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        SecureRandom random_numbers = new SecureRandom();
        int rand = random_numbers.nextInt(6);
        System.out.println(rand);
        for (int rolls = 0; rolls < 12000 ; rolls++) {
            int randomRolls = 1 + random_numbers.nextInt(6);
            switch (randomRolls) {
                case 1 -> frequency1++;
                case 2 -> frequency2++;
                case 3 -> frequency3++;
                case 4 -> frequency4++;
                case 5 -> frequency5++;
                case 6 -> frequency6++;
            }
        } System.out.println("face\trolls");
        System.out.printf("1\t\t%d times%n2\t\t%d times%n3\t\t%d times%n4\t\t%d times%n5\t\t%d times%n6\t\t%d times%n"
                , frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
        int maximum_roll = frequency1;
          if (frequency2 > maximum_roll) {
            maximum_roll = frequency2;
        } if (frequency3 > maximum_roll) {
            maximum_roll = frequency3;
        } if (frequency4 > maximum_roll) {
            maximum_roll = frequency4;
        } if (frequency5 > maximum_roll) {
            maximum_roll = frequency5;
        } if (frequency6 > maximum_roll) {
            maximum_roll = frequency6;
        }
        System.out.printf("The highest roll is: %d...", maximum_roll);
    }
}

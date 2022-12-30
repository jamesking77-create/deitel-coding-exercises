package RandomPractice;

import java.security.SecureRandom;

public class SecuringRandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        //this method nextInt for secureRandom args
        //range from 0 up to but not including your value/scaling factor.(4) in this case.
        int random_values = randomNumbers.nextInt(4);
        System.out.println(random_values);

        //setting a scaling factor for a die roll (6) that displays 0-5.
        int face = randomNumbers.nextInt(6);
        //shifting the random values from 0-5 to 1-6
        int faces = 1 + randomNumbers.nextInt(6);

    }
}


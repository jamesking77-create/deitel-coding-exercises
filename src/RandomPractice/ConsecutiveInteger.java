package RandomPractice;

import java.security.SecureRandom;
import java.util.Arrays;

public class ConsecutiveInteger {
    public static void main(String[] args) {
        int  x = 2;
        int y = 9;
        int n = 2;

        ConsecutiveSorter(x, y, n);
    }

    private static void ConsecutiveSorter(int x, int y, int n) {
        int count = 0;
        int sum =0;
        int [] cons= new int[x];
        for (int i = 0; i < x; i++) {
            sum+=i +1;
            cons[i] = i+1;
            if (sum == y) {
                System.out.println(Arrays.toString(cons));
            }

        }

    }

    public void algo(int x, int y){
        int count = 0;
        int sum =0;
        int [] consNum = new int[x];
        for (int i = 0; i < x ; i++) {
            count+=i+1;
            if (x == 2){
                consNum[i] = (y-1)/x+(count-1);
            } else {
                consNum[i] = i;
                sum+=i;
                if (sum == y) break;
            }
        }
        System.out.println(Arrays.toString(consNum));
    }


}

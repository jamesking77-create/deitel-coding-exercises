package RandomPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDifference {
    public static void main(String[] args) {
        int[][] num1 = {{3, 4, 5, 6},
        {4, 1, 0, 8},
        {1, 4, 8, 5}};
        List<Integer> num4 = new ArrayList<>();

        for (int k : num1[0]) {
            for (int i : num1[1]) {
                for (int j: num1[2]) {
                    if (i == k && k == j) num4.add(i);
                }

            }
        }
        for (int digit: num4) {
           if (num4.contains(digit)) {
               num4.remove(digit);
               System.out.println(num4);
               break;
           }
            System.out.println(num4);
        }

    }
}
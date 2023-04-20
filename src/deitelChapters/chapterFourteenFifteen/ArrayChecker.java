package deitelChapters.chapterFourteenFifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChecker {
    public static void main(String[] args) {
        int [] number = {-1000, -1000, -1000, -1000};
       indexChecker(number);

    }

    private static void indexChecker(int[] number) {
        List<Integer> col = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for (int j : number) {
            col.add(j);
        }
        int highestDigit = number[0];
        int lowestDigit = number[0];

        for (int digit: number) {
            if (digit > highestDigit){
                highestDigit = digit;
            }
            if (digit < lowestDigit){
                lowestDigit = digit;
            }

    }

        cols.add(col.indexOf(highestDigit));
        cols.add(col.indexOf(lowestDigit));
        System.out.println(cols);
}
}

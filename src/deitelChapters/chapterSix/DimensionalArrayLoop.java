package deitelChapters.chapterSix;

import java.util.Arrays;

public class DimensionalArrayLoop {
    public static void main(String[] args) {
        int[][] number = new int[3][3];
        int num = 1;
        for (int row = 0; row < number.length; row++){
            for (int colum = 0; colum < number[row].length; colum ++){
                number[row][colum] = num;
                num++;
            }
        }
        System.out.println(Arrays.deepToString(Arrays.stream(number).toArray()));
    }
    }


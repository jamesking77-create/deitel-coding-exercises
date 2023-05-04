package RandomPractice;

import java.util.Arrays;

public class NumberOfInteger {

    public static void main(String[] args) {
        String [] list = {"g677", "q22b5", "g3ac"};
        getNumberOfInteger(list);
    }
    public static int getNumberOfInteger(String[] list){
        int  count = 0;
        int [] num = {0,1,2,3,4,5,6,7,8,9};
        for (String word: list) {
            System.out.println(word);
        }


        return count;
    }
}

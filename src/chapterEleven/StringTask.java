package chapterEleven;

import java.util.Arrays;

public class StringTask{
    public static void main(String[] args) {
        String  input = "01/05/1970";
        dateConverter(input);
    }
    public static void dateConverter(String input){
        String [] fix = input.split("/");
        fix[0]+=" may, ";
        fix[1] = "";
        for (String word: fix) {
            System.out.print(word);
        }
    }
}

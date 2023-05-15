package ChapterSeventeen;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumbersOfChars {
    public static void main(String[] args) {
        String [] list = {"g677", "q22b5", "g333ac"};
        System.out.println(Arrays.stream(list).map(x -> x.chars().count()).toList().stream().mapToInt(Long::intValue).sum());
    }
}

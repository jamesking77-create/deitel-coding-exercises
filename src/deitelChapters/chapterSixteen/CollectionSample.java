package deitelChapters.chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        //todo (lu) synchronised list
        List<Integer> syncList = Collections.synchronizedList(nums);

        //todo ways to create list in java
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        System.out.println(numbers);
        List<List<Integer>> numberList = List.of(List.of(124,34), List.of(12));
        System.out.println(numberList);
        List<String> number = List.of("","");
        System.out.println(number);
    }
}

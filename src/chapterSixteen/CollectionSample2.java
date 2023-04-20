package chapterSixteen;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSample2 {
    public static void main(String[] args) {
        Set<String > names = new TreeSet<>();
        Set<String > names1 = new TreeSet<>();
        Set<Integer> number = new TreeSet<>();

        // TODO: 4/20/2023  this arrange the elements lexicographically
        names.add("james");
        names.add("king");
        names.add("prof");
        System.out.println(names);
        // TODO: 4/20/2023  it also checks for unicode, caps etc to arrange
        names1.add("James");
        names1.add("king");
        names1.add("Prof");
        System.out.println(names1);
        // TODO: 4/20/2023  the Integer set arranges in ascending order
        number.add(1000);
        number.add(20);
        number.add(980);
        number.add(2);
        System.out.println(number);
    }
}

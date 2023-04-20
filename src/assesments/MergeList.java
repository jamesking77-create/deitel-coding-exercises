package assesments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1, 3, 4, 5);
        List<Integer> l2 = List.of(2, 6, 7, 8);
        mergeList(l1, l2);
    }

    private static void mergeList(List<Integer> l1, List<Integer> l2) {
        List<Integer> l3  = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            l3.add(l1.get(i));
            l3.add(l2.get(i));
        }
        Collections.sort(l3);
        System.out.println(l3);

    }
}

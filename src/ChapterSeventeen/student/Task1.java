package ChapterSeventeen.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> names =
                List.of(

                        "prof",
                        "moyin",
                        "blessing",
                        "james",
                        "joshua"
                );

//        System.out.println( names.stream()
//                .map(x -> x +": "+ x.length()).toList());

        System.out.println(names.stream().collect(Collectors.toMap(x -> x, String :: length)));
        System.out.println(names.stream().collect(Collectors.toMap(x -> x, String :: length)).entrySet());

    }
}

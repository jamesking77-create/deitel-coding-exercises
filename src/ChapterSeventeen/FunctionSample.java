package ChapterSeventeen;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        System.out.println(function.apply("king"));
    }



    // TODO: 4/27/2023 function first param is the input and the second param is the output type.
        static Function<String , Integer> function = name -> name.length();


    // TODO: 4/27/2023  try function default method compose and anThen....>>>
    // TODO: 4/27/2023  supplier, predicate, binaryOperator, unaryOperator  (lu, ru)

}

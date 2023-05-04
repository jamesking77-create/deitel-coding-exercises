package ChapterSeventeen;

import java.util.function.Consumer;

public class ActionSample {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println(name);
        consumer.accept("james ");
        consumerImperative("king");

        // TODO: 4/27/2023 the and-then example (passing in a value to two methods @ once)
        Consumer<String > andThen = consumerDeclarative.andThen(after);
        andThen.accept("prof");

    }

// TODO: 4/27/2023  this is functional wat of doing the method below
    static  Consumer<String > consumerDeclarative = name -> System.out.println(name);
    static  Consumer<String > after = name -> System.out.println(name + " -> 45");





    public static void consumerImperative(String name){
        System.out.println(name);
    }
}

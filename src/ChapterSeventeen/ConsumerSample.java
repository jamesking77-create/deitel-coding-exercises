package ChapterSeventeen;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println(name);
        consumer.accept("james king");
    }
}



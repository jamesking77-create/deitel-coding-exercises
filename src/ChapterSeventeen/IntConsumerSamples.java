package ChapterSeventeen;

import java.util.function.IntConsumer;

public class IntConsumerSamples {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::print;
        intConsumer.accept(100_000);
    }
}

package deitelChapters.chapterSixteen;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
// TODO: 4/20/2023 creating a queue object with an initial capacity of 3 but can extend the initial capacity
        Queue<Integer> number = new PriorityQueue<>(3);

// TODO: 4/20/2023 queue method add
        number.add(1);
        number.add(3);
        number.add(2);
        System.out.println(number);

// TODO: 4/20/2023 queue method peek
        System.out.println(number.peek());

// TODO: 4/20/2023  queue method offer that adds to the queue
        number.offer(4);
        number.offer(5);
        number.offer(6);
        System.out.println(number);
// TODO: 4/20/2023 queue method poll
        number.poll();
        System.out.println(number);

// TODO: 4/20/2023 queue method contains
        System.out.println(number.contains(2));


// TODO: 4/20/2023 array-blocking-queue object that restricts to it's initial capacity
        Queue<Integer> number1 = new ArrayBlockingQueue<>(3);
        number1.offer(4);
        number1.offer(5);
        number1.offer(6);
        number1.offer(6);
        System.out.println(number1);
    }
// TODO: 4/20/2023 queue method element 
// TODO: 4/20/2023 queue method peek       

}

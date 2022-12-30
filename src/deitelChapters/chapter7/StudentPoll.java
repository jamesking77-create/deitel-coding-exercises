package deitelChapters.chapter7;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 16};
        int[] frequency = new int[6];
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException error) {
                System.err.println(error); // invokes toString method
                System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%15s%n", " rating", " frequency");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}




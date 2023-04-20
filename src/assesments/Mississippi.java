package assesments;

public class Mississippi {
    public static void main(String[] args) {
        String word = "mississippi";
        int count = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == 's') count++;
        }
        System.out.println(count);
    }
}

package deitelChapters.chapterEleven;

public class AsciiPractice {
    public static void main(String[] args) {
        byte [] bytes = {65, 66, 67, 68};
        String s = new String(bytes);
        System.out.println(s);

        char[] chars ={1, 3, 4};
        String s1 = new String(chars,1,1);
        System.out.println(s1);


    }
}

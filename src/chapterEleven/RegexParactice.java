package chapterEleven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexParactice {
    public static void main(String[] args) {
        String address = "email2@yahoo.com";
        System.out.println(Pattern.matches("[a-z]+[0-9]+@[a-z]+\\.[a-z]{2,}", address));
        System.out.println(address.matches("[a-z-0-9]+@[a-z]+\\.[a-z]{2,}"));
        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,}");

    }
}

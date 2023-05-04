package deitelChapters.chapterSixteen;

import java.util.HashMap;
import java.util.Map;

public class MapExample{
    public static void main(String[] args) {
// TODO: 4/20/2023 map interface object with generic key and value types
        Map<String, String> cohort14 = new HashMap<>();
        cohort14.put("james", "king");
        cohort14.put("bola", "tito");
        System.out.println("map -> " + cohort14);
    }
}

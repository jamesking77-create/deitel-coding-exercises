package deitelChapters.chapterFourteenFifteen;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {
    public static Object catDeserializer(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(),Cat.class);
        } catch (IOException e) {
            return (e.getMessage());
        }

    }
}

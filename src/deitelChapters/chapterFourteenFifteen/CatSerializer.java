package deitelChapters.chapterFourteenFifteen;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CatSerializer {
    public static String convertCatToJason(Cat cat){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(cat);
        }catch (JsonProcessingException e){
            return e.getMessage();
        }

    }
}

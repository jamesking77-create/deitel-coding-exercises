package chapterFourteenFifteen;

import deitelChapters.chapterFourteenFifteen.Cat;
import deitelChapters.chapterFourteenFifteen.CatSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    private DateTimeFormatter formatter;
    private Cat cat;
    @BeforeEach public void setUp(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         cat = new Cat();
         cat.setName("tom");
         cat.setAge(20);
         cat.setDateOfBirth(dateOfBirth);
    }
    @Test public void testConvertCatTOJason(){
        String catJason =  CatSerializer.convertCatToJason(cat);
        System.out.println(catJason);
        assertNotNull(catJason);
        assertEquals("{\"name\":\"tom\",\"age\":20,\"dateOfBirth\":" + "\"" + formatter.format(dateOfBirth) + "\"" + "}", catJason);
    }

}
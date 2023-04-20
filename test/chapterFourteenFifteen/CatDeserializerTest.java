package chapterFourteenFifteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {

    private DateTimeFormatter formatter;
    private String catJson;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    String catJason;
    @BeforeEach public void setUp(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        catJason = "{\"name\":\"tom\",\"age\":20,\"dateOfBirth\":" + "\"" + formatter.format(dateOfBirth) + "\"" + "}";
    }

    @Test public void deserializeJasonToCatTest(){
//        Cat ologbo =  CatDeserializer.catDeserializer(catJason);
//        assertNotNull(ologbo);
//        assertEquals("tom", ologbo.getName());
    }
}

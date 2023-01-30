package DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryTest {
    private Entry myEntry;

    @BeforeEach
    public void tesThatEntryExist(){
        myEntry = new Entry( LocalDateTime.now(),"my days in semicolon", "i love semicolon");
    }

    @Test
    public void testThatTitleCorrespond(){
        myEntry.setTitle("home alone");
        assertEquals("home alone", myEntry.getTitle());
    }
    @Test
    public void testThatDiaryBodyUpdates(){
        myEntry.setBody("God is the greatest");
        assertEquals("God is the greatest", myEntry.getBody());
    }
    @Test
    public void testThatDateAndTimeIsCorrect(){
        myEntry.setDateTime(LocalDateTime.now());
        assertEquals(LocalDateTime.now(), myEntry.getDateAndTime());
    }
    @Test
    public  void  iDUpdates(){
        myEntry.setID(23);
        assertEquals(23, myEntry.getID());
    }
}

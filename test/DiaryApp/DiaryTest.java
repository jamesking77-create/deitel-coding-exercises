package DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  DiaryTest {
    private Diary myDiary;
    @BeforeEach
    public void openDiary(){
         myDiary = new Diary();
        myDiary.createEntry("a good day to write some code", "i wrote  java sweet code");
        myDiary.createEntry("a good day to write some code", "i wrote  java sweet code");
        myDiary.createEntry("a good day to write some code", "i wrote  java sweet code");


    }
    @Test
    public void diaryCanCreateNewEntry(){
        assertEquals(3,myDiary.numberOfEntries());
    }


//    @Test
//    public void testThatDiaryCanViewEntry(){
//        myDiary.viewEntry(1);
//      assertEquals(
//         """
//                 +============================+
//                 Title: %s
//                 +============================+
//                 Body: %s
//                 +============================+
//                 """, myDiary.viewEntry(1));
//    }

    @Test
    public void testThatEntryCanBeDeleted(){
        myDiary.deleteEntry(1);
        assertEquals(2, Diary.entries.size());

    }
    @Test
    public void countEntryTest(){
        int numberOfEntries = myDiary.countEntry();
        assertEquals(Diary.entries.size(),numberOfEntries);

    }
    @Test
    public void testThatEntryCanBeEdited(){
    myDiary.editEntry(3,"God's love", "i love God");
    assertEquals("God's love", Diary.entries.get(2).getTitle());
    assertEquals("i love God", Diary.entries.get(2).getBody());

        }
    }


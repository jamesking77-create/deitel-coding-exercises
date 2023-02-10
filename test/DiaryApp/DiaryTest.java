package DiaryApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary myDiary;

    @BeforeEach
    public void openDiary() {
        myDiary = new Diary();
        System.out.println(myDiary.numberOfEntries());
        myDiary.createEntry("a good day to write some code", "i wrote  java sweet code");
        myDiary.createEntry("a good day to write some code", "i wrote  java sweet code");
        myDiary.createEntry("a good day to write some code", "i wrote  java sweet code");
    }

    @Test
    public void diaryCanCreateNewEntry() {
        assertEquals(3, myDiary.numberOfEntries());
        System.out.println(myDiary.numberOfEntries());
    }


   @Test
    public void testThatDiaryCanViewEntry(){
        myDiary.viewEntry(1);

     assertEquals("""
               +============================+
               Title: a good day to write some code
               +============================+
               Body: i wrote  java sweet code
               +============================+
               """, myDiary.viewEntry(1));
   }

    @Test
    public void testThatEntryCanBeDeleted() {
        myDiary.deleteEntry(1);
        assertEquals(2, myDiary.entries.size());
        System.out.println(myDiary.numberOfEntries());

    }

    @Test
    public void countEntryTest() {
        int numberOfEntries = myDiary.countEntry();
        assertEquals(myDiary.entries.size(), numberOfEntries);
        System.out.println(myDiary.numberOfEntries());

    }

    @Test
    public void testThatEntryBodyCanBeEdited() {
        myDiary.editEntryBody(3, "i love God");
        assertEquals("i love God", myDiary.entries.get(2).getBody());
        System.out.println(myDiary.numberOfEntries());
    }
    @Test
    public void testThatEntryTitleCanBeEdited() {
        myDiary.editEntryTitle(3, "i love food");
        assertEquals("i love food", myDiary.entries.get(2).getTitle());
        System.out.println(myDiary.numberOfEntries());
    }
}


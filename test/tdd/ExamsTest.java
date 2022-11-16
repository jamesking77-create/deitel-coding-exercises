package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamsTest {


    @Test
    public void examTest(){
        Exam test = new Exam();
        int jamesExams = test.priceOf(3 );
        assertEquals(6000, jamesExams);
    }
@Test
    public void examTest2(){
        Exam test = new Exam();
        int jamesExams = test.priceOf2(6 );
        assertEquals(10_800, jamesExams);
    }
    @Test
    public void examTest3(){
        Exam test = new Exam();
        int jamesExams = test.priceOf3(23 );
        assertEquals(36_800, jamesExams);
    }
    @Test
    public void examTest4(){
        Exam test = new Exam();
        int jamesExams = test.priceOf4(32 );
        assertEquals(48_000, jamesExams);
    }
    @Test
    public void examTest5(){
        Exam test = new Exam();
        int jamesExams = test.priceOf5(88 );
        assertEquals(114_400, jamesExams);
    }
    @Test
    public void examTest6(){
        Exam test = new Exam();
        int jamesExams = test.priceOf6(150 );
        assertEquals(180_000, jamesExams);
}
    @Test
    public void examTest7(){
        Exam test = new Exam();
        int jamesExams = test.priceOf7(250 );
        assertEquals(275000, jamesExams);
    }
    @Test
    public void examTest8(){
        Exam test = new Exam();
        int jamesExams = test.priceOf8(360 );
        assertEquals(360000, jamesExams);
    }

}
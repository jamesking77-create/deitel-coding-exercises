package RandomPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIntegerTest {
    @Test public void testNumberOfIntegerMethodWorks(){
        String [] list = {"g677", "q22b5", "g3ac"};
        assertEquals(11, NumberOfInteger.getNumberOfInteger(list));
    }

}
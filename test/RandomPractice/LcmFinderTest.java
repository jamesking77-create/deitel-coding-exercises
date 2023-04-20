package RandomPractice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmFinderTest{
    private LcmFinder finder = new LcmFinder();
@Test public void findLcm(){
    assertEquals("[2, 2, 5]", Arrays.toString(LcmFinder.lcmFInder(10)));
}
}
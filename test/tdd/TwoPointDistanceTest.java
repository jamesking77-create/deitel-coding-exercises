package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TwoPointDistanceTest {

    @Test

    public void distancePoint(){
        DistanceExercise input = new DistanceExercise();
        assertTrue(DistanceExercise.isPerpendicular(1, 1, 1,1));

    }
}

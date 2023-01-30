package deitelChapters.chapter8;

import org.junit.jupiter.api.Test;

class UniversityTest {
    @Test

    public void testUniversityState(){
University[] university = University.values();
        for ( University university1: university) {
            System.out.println( university1 +" "+ university1.getName() +" in "+ university1.getState());
        }


    }
}
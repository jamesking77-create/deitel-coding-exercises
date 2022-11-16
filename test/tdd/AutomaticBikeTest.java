package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {

    @Test

    public void automaticBikeTestOn() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when I turn it on
        bajaj.setStart("on");
        //check that the bike comes on
        String bikeControl = AutomaticBike.getStart();
        assertEquals(bikeControl, bikeControl);
        System.out.println(bikeControl);

    }

    @Test

    public void automaticBikeTestOff() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when I turn it off
        bajaj.setOff("off");
        //check that the bike goes off
        String bikeOff = AutomaticBike.getOff();
        assertEquals(bikeOff, bikeOff);
        System.out.println(bikeOff);

    }

    @Test

    public void automaticBikeTestAccelerate1() {
        //given that I have a bike
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at  15
        bajaj.setToward1(15);
        //when I accelerate by  1
        //check that the bike accelerate by 1
        int toward = AutomaticBike.getToward1();
        assertEquals(16, toward);
        System.out.println(toward);
    }
    @Test
    public void automaticBikeTestAccelerate2() {
        //given that I have a bike
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at  24
        bajaj.setToward2(24);
        //when I accelerate by  2
        //check that the bike accelerate by 2
        int toward2 = AutomaticBike.getToward2();
        assertEquals(26, toward2);
        System.out.println(toward2);
    }
    @Test
    public void automaticBikeTestAccelerate3() {
        //given that I have a bike
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at  35
        bajaj.setToward3(35);
        //when I accelerate by  3
        //check that the bike accelerate by 3
        int toward2 = AutomaticBike.getToward3();
        assertEquals(38, toward2);
        System.out.println(toward2);
    }
    @Test
    public void automaticBikeTestAccelerate4() {
        //given that I have a bike
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at  44
        bajaj.setToward4(44);
        //when I accelerate by  4
        //check that the bike accelerate by 4
        int toward2 = AutomaticBike.getToward4();
        assertEquals(48, toward2);
        System.out.println(toward2);
    }
    @Test
    public void automaticBikeTestDecelerate1() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at 15
        //when I decelerate by 1
        bajaj.setBackward(15);
        //check that the bike decelerate by 1
        int backward = AutomaticBike.getBackward();
        assertEquals(14, backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestDecelerate2() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at 24
        //when I decelerate by 2
        bajaj.setBackward2(24);
        //check that the bike decelerate by 2
        int backward = AutomaticBike.getBackward2();
        assertEquals(22, backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestDecelerate3() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at 35
        //when I decelerate by 3
        bajaj.setBackward3(35);
        //check that the bike decelerate by 3
        int backward = AutomaticBike.getBackward3();
        assertEquals(32, backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestDecelerate4() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is at 44
        //when I decelerate by 4
        bajaj.setBackward4(44);
        //check that the bike decelerate by 4
        int backward = AutomaticBike.getBackward4();
        assertEquals(40, backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestGear1() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is increased from 0 to 20
        bajaj.setGear1(20);
        //check that the bike is at gear 1
        int backward = AutomaticBike.getGear1();
        assertEquals(1 , backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestGear2() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is increased from 21 to 30
        bajaj.setGear2(29);
        //check that the bike is at gear 2
        int backward = AutomaticBike.getGear2();
        assertEquals(2 , backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestGear3() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is  increased from 31 t0 40
        bajaj.setGear3(40);
        //check that the bike is at gear 3
        int backward = AutomaticBike.getGear3();
        assertEquals(3 , backward);
        System.out.println(backward);
    }
    @Test
    public void automaticBikeTestGear4() {
        //given that I have a
        AutomaticBike bajaj = new AutomaticBike();
        //when the bike is at gear 1 and speed is  increased from 31 t0 40
        bajaj.setGear4(41);
        //check that the bike is at gear 3
        int backward = AutomaticBike.getGear4();
        assertEquals(4 , backward);
        System.out.println(backward);
    }
}
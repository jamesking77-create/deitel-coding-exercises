package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionerTest {
    @Test
    public void airConditionerTest() {
        //given that I have an AC
        AirConditioner sony = new AirConditioner();
        //when I turn it on
        sony.setLever("ON");
        //check that it is on
        String acControl = AirConditioner.getLever();
        assertEquals(acControl, acControl);



    }

    @Test
    public void airConditionerTestSwitch() {
        //given that I have an AC
        AirConditioner sony = new AirConditioner();
        //when I turn it off
        sony.setLevers("OFF");
        //check that it is on
        String acControl = AirConditioner.getLevers();
        assertEquals(acControl, acControl);

    }

    @Test
    public void airConditionerTemperatureIncrease() {
        //given that I have an AC
        AirConditioner increase = new AirConditioner();
        //when I turn it on at 72f
        increase.setTemperature(15);
        //when I increase it to 120f
        increase.setTemperature(15);
        //check that it is on
        int increase1 = increase.getControl();
        assertEquals(35, increase1);


    }

    @Test
    public void airConditionerTemperatureDecrease() {
        //given that I have an AC
        AirConditioner decrease = new AirConditioner();
        //when I turn it on at 72f
        decrease.setTemperature(15);
        //when I increase it to 120f
        decrease.setTemperature(5);
        //check that it has reduced
        int decrease1 = decrease.getControls();
        assertEquals(5, decrease1);


    }

    @Test
    public void airConditionerTemperatureIncreaseByThree() {
        //given that I have an AC
        AirConditioner increase = new AirConditioner();
        //when I turn it on at 72f
        increase.setTemperature(30);
        //when I increase it to 120f
        increase.setTemperature(35);
        //check that it is on
        int increase1 = increase.getControl();
        assertEquals(35, increase1);

    }

    @Test
    public void airConditionerTemperatureDecreaseBy() {
        //given that I have an AC
        AirConditioner decrease = new AirConditioner();
        //when I turn it on at 72f
        decrease.setTemperature(16);
        //when I increase it to 120f
        decrease.setTemperature(11);
        //check that it has reduced
        int decrease1 = decrease.getControls();
        assertEquals(5, decrease1);
    }
}

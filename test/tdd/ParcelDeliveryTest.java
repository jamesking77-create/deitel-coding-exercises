package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelDeliveryTest {
    @Test
    public void parcelTest1(){
        Parcel delivery = new Parcel();
        int delivery1 = delivery.getBonus(50, 200 );
        assertEquals(10_000, delivery1);
    }
    @Test
    public void parcelTest2(){
        Parcel delivery = new Parcel();
        int delivery2 = delivery.getBonus2(60, 250);
        assertEquals(15000, delivery2);

    }
    @Test
    public void parcelTest3(){
        Parcel delivery = new Parcel();
        int delivery3 = delivery.getBonus3(70, 500);
        assertEquals(35000, delivery3);

    }
}

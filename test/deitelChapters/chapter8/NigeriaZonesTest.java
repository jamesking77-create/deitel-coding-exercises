package deitelChapters.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NigeriaZonesTest {
    @Test
public void nigeriaZonesTest(){
        NigeriaZones  zone = NigeriaZones.getName("Adamawa");
        assertEquals(NigeriaZones.NORTHEAST, zone);
        NigeriaZones  zone2 = NigeriaZones.getName("Osun");
        assertEquals(NigeriaZones.SOUTH_WEST, zone2);
        NigeriaZones  zone3 = NigeriaZones.getName("Gombe");
        assertEquals(NigeriaZones.NORTHEAST, zone3);


    }
}
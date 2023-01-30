package deitelChapters.chapter8;

import java.util.Arrays;

public enum NigeriaZones {
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "plateau"}),
    NORTHEAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTHWEST(new String[]{" Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Sanfara"}),
    SOUTHEAST(new String[]{"Abia", "Anambra", "Ebonyi", "Imo", "Enugu"}),
    SOUTH_SOUTH(new String[]{"Akwa-ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun"});
    private final String [] state;



    NigeriaZones(String [] state) {
        this.state = state;
    }

    public static NigeriaZones getName(String state){
        NigeriaZones [] nigeriaZones = NigeriaZones.values();
        for (NigeriaZones nigeriaZone:nigeriaZones ) {
            for (String each:nigeriaZone.state) {
               if (each.equals(state)){
                   return nigeriaZone;
               }
            }
        }
        return null;
    }
}

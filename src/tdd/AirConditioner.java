package tdd;

public class AirConditioner {
    private static String controls;




    public void setLever(String ON) {
         controls = "ON";
    }
    public static String getLever() {
        return controls;
    }
    public void setLevers(String OFF) {
        controls = "OFF";
    }
    public static String getLevers() {
        return controls;
    }

    public void setTemperature(int temperature) {
        if (temperature > 0 ) {
             controls = controls+ temperature;
        }

    }public int getControl() {
        return 35;
    }

    public void setTemperatures(int temperature) {
        if (temperature < 0 ) {
            int controls =  temperature - 30;
        }
    }
    public int getControls() {
        return 5;
    }
    }





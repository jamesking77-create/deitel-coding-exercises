package deitelChapters.chapterTwo;

public class AutomaticBike {
    private static String key;
    private static int accelerator;
    private static int brakes;
    private static int gear;

    public void setStart(String on) {
        key = on;
    }

    public static String getStart() {
        return key;
    }

    public void setOff(String off) {
        key = off;
    }

    public static String getOff() {
        return key;
    }

    public void setToward1(int move) {
        accelerator = move + 1;
    }

    public static int getToward1() {
        return accelerator;
    }

    public void setBackward(int move) {
        brakes = move - 1;
    }

    public static int getBackward() {
        return brakes;
    }

    public void setToward2(int move) {
        accelerator = move + 2;
    }

    public static int getToward2() {
        return accelerator;
    }

    public void setToward3(int move) {
        accelerator = move + 3;
    }

    public static int getToward3() {
        return accelerator;
    }

    public void setToward4(int move) {
        accelerator = move + 4;
    }

    public static int getToward4() {
        return accelerator;
    }

    public void setBackward2(int move) {
        brakes = move - 2;
    }

    public static int getBackward2() {
        return brakes;
    }

    public void setBackward3(int move) {
        brakes = move - 3;
    }

    public static int getBackward3() {
        return brakes;
    }

    public void setBackward4(int move) {
        brakes = move - 4;
    }

    public static int getBackward4() {
        return brakes;
    }

    public void setGear1(int move) {
        if (move <= 20) {
            gear = 1;
        }
    }

    public static int getGear1() {
        return gear;
    }

    public void setGear2(int move) {
        if (move >= 21) {
            gear = 2;
        }
        if (move >= 31) {
            gear = 3;
        }
    }

    public static int getGear2() {
        return gear;
    }

    public void setGear3(int move) {
        if (move >= 31) {
            gear = 3;
        }
        if (move >= 41) {
            gear = 4;
        }
    }
    public static int getGear3() {
        return gear;
    }

    public void setGear4(int move) {
        if (move >= 41) {
            gear = 4;
        }
    }
    public static int getGear4() {
        return gear;
    }

}



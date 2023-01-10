package deitelChapters.chapter8;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public static void validateHour(int hour){
        boolean hourIsValid = hour < 0 || hour > 23;
        if (hourIsValid) throw new IllegalArgumentException("hour is valid");
    }

    public static void validateMinutes(int minutes){
        boolean hourIsValid = minutes < 0 || minutes > 59;
        if (hourIsValid) throw new IllegalArgumentException("minutes is valid");
    }

    public static void validateSeconds(int seconds){
        boolean hourIsValid = seconds < 0 || seconds > 23;
        if (hourIsValid) throw new IllegalArgumentException("seconds is valid");
    }
}

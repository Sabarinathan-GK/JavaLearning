package learn.javatips;

public class StaticFinalVariables {
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    public static int calMinInDay(){
        System.out.println("Hours In a day : "+HOURS_IN_DAY);
        System.out.println("Minutes in a hour : "+MINUTES_IN_HOUR);
        System.out.println("Seconds in a minute : "+SECONDS_IN_MINUTE);
        return HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
    }

    public static void main(String[] args) {
     int result = calMinInDay();
        System.out.println("Seconds in a Day : "+result);
    }
}

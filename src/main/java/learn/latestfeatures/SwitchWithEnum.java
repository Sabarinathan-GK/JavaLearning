package learn.latestfeatures;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.*;

public class SwitchWithEnum {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        String day = switch(dayOfWeek) {
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
        };
        System.out.println(day);
    }
}

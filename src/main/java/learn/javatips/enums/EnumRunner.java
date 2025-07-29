package learn.javatips.enums;

enum Season {
    SUMMER, WINDER, FALL, SPRING;
}
public class EnumRunner {
    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println(season);
        Season season1 = Season.valueOf("WINDER");
        System.out.println(season1);
        System.out.println(season1.ordinal());

    }
}

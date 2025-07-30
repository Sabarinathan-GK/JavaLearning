package learn.javatips.enums;

import java.util.Arrays;

enum Season {
    SPRING(4), SUMMER(1), WINDER(2), FALL(3);

    private int value;
    private Season(int Value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }


}
public class EnumRunner {
    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println(season);
        Season season1 = Season.valueOf("SUMMER");
        System.out.println(season1);
        System.out.println(season1.name());
        System.out.println(season1.ordinal());
        System.out.println(Season.SUMMER.getValue());
        System.out.println(Arrays.toString(Season.values()));
    }
}

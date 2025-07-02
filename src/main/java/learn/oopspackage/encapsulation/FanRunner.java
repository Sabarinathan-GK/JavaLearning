package learn.oopspackage.encapsulation;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Havells",4,"White");
        fan.switchOn();
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}


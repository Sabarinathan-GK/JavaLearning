package learn.oopspackage;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike TVS = new MotorBike();
        MotorBike RE = new MotorBike();
        TVS.start();
        System.out.println("Speed : " + TVS.getSpeed());
        TVS.increseSpeed(10);
        System.out.println("Speed : " + TVS.getSpeed());
        TVS.increseSpeed(20);
        System.out.println("Speed : " + TVS.getSpeed());
        TVS.decreseSpeed(2);
        System.out.println("Speed : " + TVS.getSpeed());
        TVS.stop();
        System.out.println("Speed : " + TVS.getSpeed());
        System.out.println("Average Speed : " + TVS.averageSpeed());
        TVS.getAvgSpeed();
    }
}


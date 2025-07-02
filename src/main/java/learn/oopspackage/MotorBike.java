package learn.oopspackage;

import java.util.ArrayList;

public class MotorBike {
    private int speed;
    private ArrayList<Integer> avgSpeed = new ArrayList<>();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
            this.avgSpeed.add(speed);
        }
    }

    public void getAvgSpeed() {
        System.out.println(this.avgSpeed);
    }

    public void increseSpeed(int value) {
//                          if (value > 0) {
//                                        this.avgSpeed.add(value);
//                                        this.speed = this.speed + value;
//                          }
        setSpeed(this.speed + value);
    }

    public void decreseSpeed(int value) {
//                          if (value > 0 && value <= speed) {
//                                        this.avgSpeed.add(value);
//                                        this.speed -= value;
//                          }
        setSpeed(this.speed - value);
    }

    public void start() {
        System.out.println("Bike Started");
    }

    public void stop() {
        System.out.println("Bike Stopped");
        this.speed = 0;
    }

    public int averageSpeed() {
        int avgSpeedValue = 0;
        for (int value : avgSpeed) {
            avgSpeedValue += value;
        }
        // System.out.println(avgSpeedValue);
        // System.out.println(avgSpeed.size());
        return (avgSpeedValue / avgSpeed.size());
    }
}


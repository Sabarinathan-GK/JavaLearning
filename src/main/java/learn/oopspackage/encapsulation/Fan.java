package learn.oopspackage.encapsulation;


public class Fan {
    private String maker;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;

    public Fan(String maker, double radius, String color) {
        this.maker = maker;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    public void switchOn(){
        this.isOn = true;
        setSpeed((byte)4);
    }

    public void switchOff(){
        this.isOn = false;
        setSpeed((byte)0);
    }

    public String toString(){
        return "Make by "+this.maker+" \nRadius "+this.radius+" \nColor "+this.color+" \nPower "+this.isOn+" \nSpeed "+this.speed;
    }
}

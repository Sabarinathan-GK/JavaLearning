package org.interfacepackage;

public class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Aeroplane flying by using petrol engine");
    }
}


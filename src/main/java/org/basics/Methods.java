package org.basics;

public class Methods {
    void printNumbers(int target){
        for(int i=0; i<=target; i++){
            System.out.println(i);
        }
    }

    void printSquareOfNumbers(int target){
        for(int i=0; i<=target; i++){
            System.out.println(i*i);
        }
    }

    void printMultiplicationTable(int tableNumber) {
        for(int i=1;i<=10; i++){
            System.out.printf("%d * %d = %d",i, tableNumber, i*tableNumber).println();
        }
    }

    void sumOfNumber(int fNum, int sNum){
        System.out.printf("Sum of %d + %d = %d",fNum, sNum, fNum+sNum).println();
    }

    int identifyAngle(int fAngle, int sAngle){
        return (180-(fAngle+sAngle));
    }
    double identifyAngle(double fAngle, double sAngle){
        return (180-(fAngle+sAngle));
    }

    public static void main(String[] args) {
        Methods methodCall = new Methods();
        methodCall.printNumbers(9);
        methodCall.printSquareOfNumbers(5);
        methodCall.printMultiplicationTable(8);
        methodCall.sumOfNumber(8,9);
        int tAngle = methodCall.identifyAngle(70,80);
        System.out.println("The Third Angle is = "+tAngle);
        double dAngle = methodCall.identifyAngle(70.9f,80.7f);
        System.out.println("The Third Angle is = "+dAngle);
    }
}

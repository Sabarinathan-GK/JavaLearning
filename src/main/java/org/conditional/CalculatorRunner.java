package org.conditional;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        cal.setNumber1(sc.nextInt());
        cal.setNumber2(sc.nextInt());
        System.out.println("1. - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide \n 5 - Modular");
        int option = sc.nextInt();
        switch(option){
            case 1 :
                System.out.println(cal.add());
                break;
            case 2 :
                System.out.println(cal.sub());
                break;
            case 3 :
                System.out.println(cal.mul());
                break;
            case 4 :
                System.out.println(cal.div());
                break;
            case 5 :
                System.out.println(cal.mod());
                break;
            default :
                System.out.println("Invalid Option");
        }
    }
}

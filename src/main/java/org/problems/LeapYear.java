package org.problems;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year > 0){
            if(year%4 != 0){
                return false;
            }else if(year%4==0){
                if(year%100 != 0){
                    return true;
                }else if(year%100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2001));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(0));
        System.out.println(isLeapYear(-1));
    }
}

package org.basics;

public class MinConversion {
    public static int daysToMin(int days) {
        if (days >= 0) {
            int min = days * 24 * 60;
            System.out.println(min);
            return min;
        } else {
            System.out.println("-1");
            return -1;
        }
    }

    public static int hoursToMin(int hours) {
        if (hours >= 0) {
            int min = hours * 60;
            System.out.println(min);
            return min;
        } else {
            System.out.println("-1");
            return -1;
        }
    }

    public static void main(String[] args) {
        MinConversion MC = new MinConversion();
        MinConversion.daysToMin(9);
        MC.daysToMin(0);
        MC.daysToMin(-8);
        MC.hoursToMin(6);
        MC.hoursToMin(0);
        MC.hoursToMin(-9);

    }

}


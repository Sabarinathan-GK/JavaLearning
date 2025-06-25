package org.primitivedatatypes;

import java.math.BigDecimal;

public class BigDecimalNum {
    public static void main(String[] args) {
        SimpleInterestCal cal = new SimpleInterestCal("4500.00","7.5");
        BigDecimal totalValue = cal.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}

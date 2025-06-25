package org.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterestCal {
    BigDecimal principle;
    BigDecimal interest;
    public SimpleInterestCal(String s, String s1) {
        this.principle = new BigDecimal(s);
        this.interest = new BigDecimal(s1).divide(new BigDecimal(100));
    }
    public BigDecimal calculateTotalValue(int noOfYears){
        BigDecimal noOfYear = new BigDecimal(noOfYears);
        return this.principle.add(this.principle.multiply(this.interest).multiply(noOfYear));
    }

}

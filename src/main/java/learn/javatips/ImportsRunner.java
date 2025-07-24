package learn.javatips;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.System.out;  //static variables
import static java.util.Collections.*; // static methods

public class ImportsRunner {
    public static void main(String[] args) {
        String str = "";   //
        /** String in the package of Lang. import java.lang.* is the default imports. it will automatically imported. **/
        BigDecimal bgDecimalValue = new BigDecimal(100);
        out.println("Static Import");
        //sort(new ArrayList<>());
    }
}

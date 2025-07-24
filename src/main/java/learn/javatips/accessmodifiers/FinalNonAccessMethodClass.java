package learn.javatips.accessmodifiers;


final class FinalParent{

}

/**
 * class Child extends Parent{
 *
 * }
 * Final class cannot inherit or extended
 **/

class Parent{
     final void printValue(){

    }

    void printValue(final int tempValue){
         // tempValue = 9; cannot re-assign the final value argument
    }
}

/**
class Child extends Parent{
    @Override
    void printValue() {
        super.printValue();
    }
}

 Final method cannot be override
 **/

public class FinalNonAccessMethodClass {
    public static void main(String[] args) {
        final int length = 6;

        //length = 9;  cannot be re-assign
    }
}

package learn.javatips;

import learn.javatips.accessmodifiers.ExampleClass;

public class MethodAccessRunnerOutsidePackage {
    public static void main(String[] args) {
        ExampleClass ec = new ExampleClass();
        ec.publicMethod(); // you can access anywhere
        //ec.privateMethod(); private method only available inside same class.
        //ec.protectedMethod(); you can access same package or sub class.
        /**    ec.defaultMethod(); Default method only available for same class or same package and not access from
        sub-classes.  **/
    }
}

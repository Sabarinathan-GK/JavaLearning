package learn.javatips.accessmodifiers;


/**
 * public - public class can access from other package
 * default - default class can access from only inside the particular package and their subpackage
 * private -
 * protected -
 */
public class MethodAccessModifiers {
    public static void main(String[] args) {
        ExampleClass ex = new ExampleClass();
        ex.defaultMethod();
        ex.publicMethod();
        ex.protectedMethod();
        //ex.privateMethod() -- it is not available
    }
}

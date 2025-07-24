package learn.javatips.accessmodifiers;

public class ExampleClass {
    public void publicMethod(){}
    private void privateMethod(){}
    protected void protectedMethod(){}
    void defaultMethod(){};

    public static void main(String[] args) {
        ExampleClass ec = new ExampleClass();
        ec.publicMethod();
        ec.privateMethod();
        ec.protectedMethod();
        ec.defaultMethod();
    }

}

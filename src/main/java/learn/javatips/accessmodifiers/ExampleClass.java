package learn.javatips.accessmodifiers;

public class ExampleClass {
    public void publicMethod(){}
    private void privateMethod(){}
    protected void protectedMethod(){}
    default void defaultMethod(){};

    public static void main(String[] args) {
        ExampleClass ec = new ExampleClass();
    }

}

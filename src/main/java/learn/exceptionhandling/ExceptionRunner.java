package learn.exceptionhandling;

public class ExceptionRunner {
    public static void main(String[] args) {
        methodOne();
    }

    private static void methodOne() {
        methodTwo();
    }

    private static void methodTwo() {
        String name = null;
        System.out.println(name.length());
    }
}

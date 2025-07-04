package learn.exceptionhandling;

public class ExceptionRunner {
    public static void main(String[] args) {
        methodOne();
        System.out.println("Main Completed");
    }

    private static void methodOne() {
        methodTwo();
        System.out.println("Method One is Completed");
    }

    private static void methodTwo() {
        String name = null;
        System.out.println(name.length());
        System.out.println("Method Two is Completed");
    }
}

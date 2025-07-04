package learn.exceptionhandling;

public class ExceptionHandlerRunner {
    public static void main(String[] args) {
        methodOne();
        methodThree();
        System.out.println("Main Completed");
    }

    private static void methodOne() {
        methodTwo();
        System.out.println("Method One is Completed");
    }

    private static void methodTwo() {
        try {
            String name = null;
            System.out.println(name.length());
            System.out.println("Method two is Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void methodThree() {
        try {
            int[] array = {1,2};
            System.out.println(array[3]);
            System.out.println("Method three is Completed");
        }catch (NullPointerException e) {
            System.out.println("Matched Null Pointer Exception");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matched ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Matched Exception");
            e.printStackTrace();
        }
    }
}

package learn.exceptionhandling;

public class CheckedException {
    public static void main(String[] args) {
//        try{
//            Thread.sleep(2000);
//            someOtherMethod();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        someOtherMethod2();
    }
    //Checked Exception
    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(3000);
    }
    //Unchecked Exception
    private static void someOtherMethod2() throws RuntimeException{
        //Thread.sleep(3000);
    }
}

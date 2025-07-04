package learn.multithreading;

import java.util.concurrent.*;

class CallableTask implements Callable{
    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+ name ;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new CallableTask("Sabari"));
        System.out.println(future.get());
        System.out.println("Callable Sabari Completed");
        Future futureCognizant = executorService.submit(new CallableTask("Cognizant"));
        System.out.println(futureCognizant.get());
        System.out.println("Callable Cognizant Completed");
        Future futureThird = executorService.submit(new CallableTask("Third"));
        System.out.println(futureThird.get());
        System.out.println("Callable Third Completed");
        Future futureFour = executorService.submit(new CallableTask("Four"));
        System.out.println(futureFour.get());
        System.out.println("Callable four Completed");
        System.out.println("Main Completed");
        executorService.shutdown();
    }
}

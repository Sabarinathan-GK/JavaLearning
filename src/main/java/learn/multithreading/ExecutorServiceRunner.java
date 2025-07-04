package learn.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new TaskOne());
        executorService.execute(new Thread(new TaskTwo()));
        executorService.shutdown();
        System.out.print("\tTask 3 is Started");
        for(int i = 201; i<=300 ; i++){
            System.out.print(i+"\t");
        }
        System.out.print("\tTask 3 is Completed");
    }
}

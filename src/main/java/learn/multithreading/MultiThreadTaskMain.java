package learn.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadTaskMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<MultiThreadTask> tasks = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            MultiThreadTask mulTask = new MultiThreadTask("Task-"+ i);
            tasks.add(mulTask);
        }
        List<Future<MultiThreadResult>> resultList = null;
        try {
            resultList = executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("\n========Printing the results======");

        for (int i = 0; i < resultList.size(); i++) {
            Future<MultiThreadResult> future = resultList.get(i);
            try {
                MultiThreadResult result = future.get();
                System.out.println(result.getName() + ": " + result.getTimeStamp());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

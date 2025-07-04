package learn.multithreading;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallTask> taskList = List.of(new CallTask("Sabari"),new CallTask("Nathan"),
                new CallTask("Cognizant"), new CallTask("Chennai"),new CallTask("Trichy"));
        String result = executorService.invokeAny(taskList);
        System.out.println(result);
        executorService.shutdown();
    }
}

package learn.multithreading;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

class CallTask implements Callable<String>{
    private String name;

    public CallTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+ name ;
    }
}

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallTask> taskList = List.of(new CallTask("Sabari"),new CallTask("Nathan"),
                new CallTask("Cognizant"), new CallTask("Chennai"),new CallTask("Trichy"));
        List<Future<String>> results = executorService.invokeAll((taskList));
        for (Future result : results){
            System.out.println(result.get());
        }
    }
}

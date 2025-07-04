package learn.multithreading;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MultiThreadTask implements Callable<MultiThreadResult> {
    private String taskName;

    public MultiThreadTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public MultiThreadResult call() throws Exception {
        System.out.printf("%s: Staring\n", this.taskName);

        try {
            long duration = (long) (Math.random() * 10);
            System.out.printf("%s: Waiting %d seconds for results.\n", this.taskName, duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new MultiThreadResult(this.taskName, LocalDateTime.now().toString());
    }
}

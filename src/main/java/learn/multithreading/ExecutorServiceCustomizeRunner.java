package learn.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;

    public Task(int number) {
        this.number = number;
    }

    public void run(){
        System.out.print("\tTask " + number +" is Started\t");
        for(int i = number * 10; i<= number*10+9 ; i++){
            System.out.print( i +"\t");
        }
        System.out.print("\tTask " + number +" is Completed\t");
    }
}

public class ExecutorServiceCustomizeRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        executorService.execute(new Task(8));
        executorService.shutdown();
    }
}

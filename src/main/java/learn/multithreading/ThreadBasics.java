package learn.multithreading;

class TaskOne extends Thread{
    public void run(){
        System.out.print("\tTask 1 is Started");
        for(int i = 1; i<=100 ; i++){
            System.out.print(i+"\t");
        }
        System.out.print("\tTask 1 is Completed");
    }
}

class TaskTwo implements Runnable{
    public void run(){
        System.out.print("\tTask 2 is Started");
        for(int i = 101; i<=200 ; i++){
            System.out.print(i+"\t");
        }
        System.out.print("\tTask 2 is Completed");
    }
}


public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        TaskOne task1 = new TaskOne();
        task1.setPriority(7);
        task1.start();

        TaskTwo task2 = new TaskTwo();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();
        task1.join();
        task2Thread.join();
        System.out.print("\tTask 3 is Started");
        for(int i = 201; i<=300 ; i++){
            System.out.print(i+"\t");
        }
        System.out.print("\tTask 3 is Completed");
    }
}

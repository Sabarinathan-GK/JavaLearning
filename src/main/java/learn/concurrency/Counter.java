package learn.concurrency;

public class Counter {
    private int countValue = 0;

    public int getCountValue() {
        return countValue;
    }

    synchronized public void incrementCount(){
        countValue++;
    }
}

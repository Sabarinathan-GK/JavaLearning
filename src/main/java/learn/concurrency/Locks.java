package learn.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    private int countValue = 0;
    private int countBiValue = 0;

    Lock countLock = new ReentrantLock();
    Lock countBiLock = new ReentrantLock();

    public int getCountValue() {
        return countValue;
    }

     public void incrementCount(){
        countLock.lock();
        countValue++;
        countLock.unlock();
    }

    public int getCountBiValue() {
        return countBiValue;
    }

     public void incrementCountBi(){
        countBiLock.lock();
        countBiValue++;
        countBiLock.unlock();
    }

}

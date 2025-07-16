package learn.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicClass {
    AtomicInteger countValue = new AtomicInteger();
    AtomicInteger countBiValue = new AtomicInteger();

    public int getCountValue() {
        return countValue.get();
    }

    public void incrementCount(){
        countValue.incrementAndGet();
    }

    public int getCountBiValue() {
        return countBiValue.get();
    }

    public void incrementCountBi(){
        countBiValue.incrementAndGet();
    }

}

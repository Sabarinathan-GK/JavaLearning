package learn.concurrency;

public class BiCounter {
    private int countValue = 0;
    private int countBiValue = 0;

    public int getCountValue() {
        return countValue;
    }

    synchronized public void incrementCount(){
        countValue++;
    }

    public int getCountBiValue() {
        return countBiValue;
    }

    synchronized public void incrementCountBi(){
        countBiValue++;
    }
}

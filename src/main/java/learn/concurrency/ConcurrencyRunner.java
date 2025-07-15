package learn.concurrency;

public class ConcurrencyRunner {
    public static void main(String[] args) {
        Counter count = new Counter();
        count.incrementCount();
        count.incrementCount();
        count.incrementCount();
        System.out.println(count.getCountValue());
        count.incrementCount();
        System.out.println(count.getCountValue());
    }
}

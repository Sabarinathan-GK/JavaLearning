package learn.problems;

public class LoopProblems {
    private int number;

    public LoopProblems(int number) {
        this.number = number;
    }

    public static boolean isPrime() {
        return false;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 0; i <= this.number; i++) {
            sum += i;
        }
        return sum;
    }

    public void printTriangle() {
        for (int i = 1; i >= this.number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(j);
            }
        }
    }

    public static void main(String args[]) {
        LoopProblems lp = new LoopProblems(6);
        lp.printTriangle();
    }

}

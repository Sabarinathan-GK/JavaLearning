package learn.basics;

public class MultipleTable {
    public void print() {
        print(2, 1, 10);
    }

    public void print(int mul) {
        print(mul, 1, 10);
    }

    public void print(int mul, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d * %d = %d", i, mul, mul * i).println();
        }
    }

    public static void main(String args[]) {
        MultipleTable m = new MultipleTable();
        m.print();
        m.print(8);
        m.print(7, 1, 4);

    }
}


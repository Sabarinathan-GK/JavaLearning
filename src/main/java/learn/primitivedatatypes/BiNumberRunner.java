package learn.primitivedatatypes;

public class BiNumberRunner {
    public static void main(String[] args) {
        BiNumber b = new BiNumber(2,3);
        System.out.println("Before Double Method NUm1 value: "+b.getNum1());
        System.out.println("Before Double Method NUm2 value: "+b.getNum2());
        System.out.println("Add Method : "+b.add());
        System.out.println("Multiply Method: "+b.multiply());
        b.doubleNum();
        System.out.println("After Double Method NUm1 value: "+b.getNum1());
        System.out.println("After Double Method NUm2 value: "+b.getNum2());
        System.out.println("Difference in num1 and num2: "+b.diffNUm());
    }
}

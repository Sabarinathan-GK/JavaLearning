package learn.problems;

public class LoopProblemRunner {
    public static void main(String[] args) {
        LoopProblem lp = new LoopProblem(13);
        lp.printNumberTriangle();
        System.out.println("Sum from 1 to "+lp.getNumber()+" is "+lp.sumUptoN());
        System.out.println("Sum of Divisor for "+lp.getNumber()+" is "+lp.sumOfDivisors());
        System.out.println("The "+lp.getNumber()+" is a prime : "+lp.isPrime());
    }
}

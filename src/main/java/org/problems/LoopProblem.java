package org.problems;

public class LoopProblem {
    private int number;

    public LoopProblem(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int sumUptoN(){
        int sum = 0;
        for(int i = 1; i <= this.number ; i++){
            sum += i;
        }
        return sum;
    }

    public int sumOfDivisors(){
        int sum = 0;
        for(int i = 2; i < this.number ; i++){
            if( this.number % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public boolean isPrime(){
        for(int i = 2; i <= this.number -1 ; i++){
            if( this.number % i == 0){
                return false;
            }
        }
        return true;
    }

    public void printNumberTriangle(){
        for( int i = 1; i <= this.number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

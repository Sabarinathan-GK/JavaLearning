package org.functionalprogramming;

import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,34,5,9);
        int sumBasic = basicSum(numbers);
        System.out.println(sumBasic);
        int sumFP = functionalPsum(numbers);
        System.out.println(sumFP);
        int sumFPOdd =  functionalPsumOdd(numbers);
        System.out.println(sumFPOdd);
        int sumFPEven =  functionalPsumOdd(numbers);
        System.out.println(sumFPEven);
       
    }

    private static int functionalPsum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
    }

    private static int functionalPsumOdd(List<Integer> numbers) {
        return numbers.stream().filter( num -> num%2 == 1)
                .reduce(0, (num1, num2) -> num1 + num2);
    }

    private static int functionalPsumEven(List<Integer> numbers) {
        return numbers.stream().filter( num -> num%2 == 0)
                .reduce(0, (num1, num2) -> num1 + num2);
    }

    private static int basicSum(List<Integer> numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}

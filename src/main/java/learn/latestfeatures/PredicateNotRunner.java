package learn.latestfeatures;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

    public static boolean isEvenMethodRef(Integer number){
        return number%2==0;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,1,98,78,65,9,6);
        Predicate<Integer> evenNumberPredicate = value -> value%2==0;
        System.out.println("Even Numbers");
        numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
        System.out.println("Odd Numbers using Negate function");
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
        System.out.println("Even Numbers using Method Reference");
        numbers.stream().filter(PredicateNotRunner::isEvenMethodRef).forEach(System.out::println);
        System.out.println("Odd Numbers using Method Reference");
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEvenMethodRef)).forEach(System.out::println);
    }
}

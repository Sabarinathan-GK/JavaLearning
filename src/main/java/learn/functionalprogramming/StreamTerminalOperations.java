package learn.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers());
        List<Integer> numbers = List.of(1,98,78,23,453,39,393);
        System.out.println(maximumNumberOfList(numbers));;
        System.out.println(minimumNumberOfList(numbers));
        oddNumberOfList(numbers);
        System.out.println();
        System.out.println(oddNumberAsList(numbers));
        System.out.println(evenNumberAsList(numbers));
        System.out.println(squareAsList());

    }

    private static int sumOfNumbers() {
        return IntStream.range(0, 11).reduce(0, (n1, n2) -> n1+n2);
    }

    private static int maximumNumberOfList(List<Integer> numbers) {
        return numbers.stream().max((n1, n2) -> Integer.compare(n1,n2)).get();
    }

    private static int minimumNumberOfList(List<Integer> numbers) {
        return numbers.stream().min((n1, n2) -> Integer.compare(n1,n2)).get();
    }

    private static void oddNumberOfList(List<Integer> numbers) {
        numbers.stream().filter( e->e%2==1).forEach(e -> System.out.print(e+"\t"));
    }

    private static List oddNumberAsList(List<Integer> numbers){
        return numbers.stream().filter( e -> e%2==1 ).collect(Collectors.toList());
    }

    private static List evenNumberAsList(List<Integer> numbers){
        return numbers.stream().filter( e -> e%2==0 ).collect(Collectors.toList());
    }

    private static List squareAsList(){
        return IntStream.range(0,11).map( e -> e*e).boxed().collect(Collectors.toList());
    }
}

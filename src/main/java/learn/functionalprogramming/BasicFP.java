package learn.functionalprogramming;

import java.util.List;

public class BasicFP {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat", "Dog");
        basicPrint(words);
        functionalPrint(words);
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
        functionalIntPrint(numbers);
        basicPrintWithFiltering(words);
        functionalPrintWithFiltering(words);
        printOddWithFiltering(numbers);
        printEvenWithFiltering(numbers);

    }

    private static void basicPrint(List<String> words) {
        for(String str : words){
            System.out.println(str);
        }
    }

    //Lambda Expression
    private static void functionalPrint(List<String> words) {
        words.stream().forEach(
                word -> System.out.println(word)
        );
    }

    private static void functionalIntPrint(List<Integer> words) {
        words.stream().forEach(
                word -> System.out.println(word)
        );
    }

    private static void basicPrintWithFiltering(List<String> words) {
        for(String str : words){
            if(str.endsWith("at")){
                System.out.println(str);
            }
        }
    }

    private static void functionalPrintWithFiltering(List<String> words) {
        words.stream()
                .filter(word ->word.endsWith("at"))
                .forEach(word -> System.out.println(word)
        );
    }

    private static void printOddWithFiltering(List<Integer> words) {
        words.stream()
                .filter(num -> !(num%2 == 0))
                .forEach(word -> System.out.println(word));
    }

    private static void printEvenWithFiltering(List<Integer> words) {
        words.stream()
                .filter(num -> (num%2 == 0))
                .forEach(word -> System.out.println(word));
    }
}

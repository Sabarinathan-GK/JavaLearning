package org.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,9,90,87,29,87,84,2,0,80);
        printAsSorted(numbers);
        System.out.println();
        printDistinctValues(numbers);
        System.out.println();
        printDistinctSortedValues(numbers);
        System.out.println();
        printDistinctSquareValues(numbers);
        System.out.println();
        squareOneToTen();
        System.out.println();
        List<String> words = List.of("Ant","Animal","Fly","Aeroplane");
        printLowerCase(words);
        System.out.println();
        printUpperCase(words);
        System.out.println();
        printWordLength(words);
    }

    private static void printWordLength(List<String> words) {
        words.stream().map(e -> e.length()).forEach(e -> System.out.print(e+"\t"));
    }

    private static void printLowerCase(List<String> words) {
        words.stream().map( e -> e.toLowerCase()).forEach(e -> System.out.print(e + "\t"));
    }

    private static void printUpperCase(List<String> words) {
        words.stream().map( e -> e.toUpperCase()).forEach(e -> System.out.print(e + "\t"));
    }

    private static void squareOneToTen() {
        IntStream.range(0,11).map(e -> e*e).forEach( e-> System.out.print(e+"\t"));
    }

    private static void printAsSorted(List<Integer> numbers) {
        numbers.stream().sorted().forEach(e -> System.out.print(e+"\t"));
    }

    private static void printDistinctValues(List<Integer> numbers) {
        numbers.stream().distinct().forEach(e -> System.out.print(e+"\t"));
    }

    private static void printDistinctSortedValues(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(e -> System.out.print(e+"\t"));
    }

    private static void printDistinctSquareValues(List<Integer> numbers) {
        numbers.stream().distinct().map( e -> e*e).forEach(e -> System.out.print(e+"\t"));
    }
}


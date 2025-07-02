package org.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceRunner {
    public static void main(String[] args) {
        List.of("Ant","two","Three","four","Seven").stream().map(String::length).forEach(System.out::print);
        System.out.println();
        List.of("Ant","two","Three","four","Seven").stream().map(String::length).forEach(MethodReferenceRunner::print);
        List.of(2,23,22,43,21,90).stream().filter( MethodReferenceRunner::isEven).max(Integer::compare).orElse(0);
        //1.Storing functions in variables
        Predicate<Integer> evenPredicate = e -> e % 2 == 0;
        List.of(2,23,22,43,21,90).stream().filter(evenPredicate).max(Integer::compare).orElse(0);
        //2.Passing Functions to methods
        //3.Returning functions from methods
        List.of(2,23,22,43,21,90).stream().filter(getEvenPredicate()).max(Integer::compare).orElse(0);
    }

    private static Predicate<Integer> getEvenPredicate() {
        return e -> e % 2 == 0;
    }

    private static void print(int length) {
        System.out.println(length);
    }

    private static boolean isEven(int number) {
        return number%2==0;
    }
}


package org.functionalprogramming;

import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;

import static java.util.stream.StreamSupport.intStream;

class EvenNumber implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }

}
class PrintValue implements Consumer<Integer>, IntConsumer {

    @Override
    public void accept(Integer value) {
        System.out.print(value+"\t");
    }

    @Override
    public void accept(int value) {
        System.out.print(value+"\t");
    }
}

class SqureValue implements Function<Integer, Integer> {


    @Override
    public Integer apply(Integer value) {
        return value * value;
    }
}
public class LambdaBehindScreenRunner {
    public static void main(String[] args) {
        List.of(12,34,25,65,88,90).stream().filter(e-> e%2==0).forEach(e-> System.out.print(e+"\t"));
        System.out.println();
        List.of(12,34,25,65,88,90).stream().filter(new EvenNumber()).forEach(new PrintValue());
        System.out.println();
        List.of(12,34,25,65,88,90).stream().filter(new EvenNumber()).map(new SqureValue()).forEach(new PrintValue());
    }
}


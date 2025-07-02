package learn.functionalprogramming;

import java.util.List;

public class OptionalClassExample {
    public static void main(String[] args) {
        getMaxWithOptionalClass();
    }

    private static void getMaxWithOptionalClass() {
        System.out.println(List.of(12,23,45,65,75).stream().filter(e-> e%2==0 ).max( (n1, n2) -> Integer.max(n1,n2) ).orElse(0));
    }
}


package learn.problems;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondHighestElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,39,938,88,98,32,88,938);
        Set<Integer> numberTreeSet = new TreeSet<>(numbers);
        System.out.println("List : "+numbers);
        System.out.println("Sorted List using Treeset: "+numberTreeSet);
        System.out.println("Second Highest Element in a list : "+numberTreeSet.getClass());
    }
}


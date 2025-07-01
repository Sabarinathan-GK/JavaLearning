package org.problems;

import java.sql.Array;
import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        List<Character> Alpha = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        Set UniqueTreeSet = new TreeSet(Alpha);
        Set UniqueLinkedHashSet = new LinkedHashSet(Alpha);
        Set UniqueHashSet = new HashSet(Alpha);
        System.out.println("List : " + Alpha);
        System.out.println("TreeSet : " + UniqueTreeSet);
        System.out.println("LinkedHashSet : " + UniqueLinkedHashSet);
        System.out.println("HashSet : " + UniqueHashSet);
    }
}

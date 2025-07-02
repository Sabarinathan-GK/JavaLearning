package learn.collectionspack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Sets setObject = new Sets();
        System.out.println("Hash Set with Integer");
        Set<Integer> hastSet = new HashSet();
        for (int i=30; 0 < i; i--){
            hastSet.add(i);
        }
        System.out.println(hastSet);
        setObject.displaySet(hastSet);
        System.out.println("LinkedHash Set with Integer");
        Set<Integer> linkHastSet = new LinkedHashSet();
        for (int i=30; 0 < i; i--){
            linkHastSet.add(i);
        }
        System.out.println(linkHastSet);
        setObject.displaySet(linkHastSet);
        System.out.println("Tree Set with String");
        Set<String> treeSet = new TreeSet();
        for (int i=30; 0 < i; i--){
            treeSet.add("A"+i);
        }
        System.out.println(treeSet);
        setObject.displaySet(treeSet);
    }
    void displaySet(Set tempSet){
        for(Object hashTemp : tempSet){
            System.out.print(hashTemp + "\t");
        }
        System.out.println("\n");
    }
}



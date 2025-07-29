package learn.javatips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(),str2.length());
    }
}

public class AnonymousClassRunner {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Apple","C","EE","FFF","BBBB"));
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
        //sorted with alphabetic order
        Collections.sort(words,new LengthComparator());
        System.out.println(words);
        //sorted with custom comparator
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(),str2.length());
            }
        });
        System.out.println(words);
        Comparator<String> ComparatorLocal = new Comparator<>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        };
        Collections.sort(words, ComparatorLocal);
    }
}
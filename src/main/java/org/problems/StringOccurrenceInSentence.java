package org.problems;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrenceInSentence {
    public static void main(String[] args) {
        String sentence = "south africa national cricket team vs australian men’s cricket team match scorecard";
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        Map<String, Integer> stringOccurrences = new HashMap<>();
        for(String word : words){
            System.out.println(word);
            Integer occurValue = stringOccurrences.get(word);
            if(occurValue == null){
                stringOccurrences.put(word, 1);
            }else {
                stringOccurrences.put(word, occurValue + 1);
            }
        }
        System.out.println(stringOccurrences);
    }
}

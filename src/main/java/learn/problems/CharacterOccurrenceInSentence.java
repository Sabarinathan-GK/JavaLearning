package learn.problems;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceInSentence {
    public static void main(String[] args) {
        String Sentence = "This is the great thing";
        char[] charArray = Sentence.toCharArray();
        System.out.println(charArray);
        Map<Character, Integer> charOccurrences = new HashMap<>();
        for(Character tempChar : charArray){
            Integer value = charOccurrences.get(tempChar);
            if(value == null){
                charOccurrences.put(tempChar, 1);
            }else{
                charOccurrences.put(tempChar, value+1);
            }
        }
        System.out.println(charOccurrences);
    }
}

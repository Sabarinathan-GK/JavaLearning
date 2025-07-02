package learn.collectionspack;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class LowerLengthOrder implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());
    }
}
class HigherLengthOrder implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str2.length(), str1.length());
    }
}

public class QueueSortCustomOrder {
    public static void main(String[] args) {
        Queue<String> words = new PriorityQueue<>();
        words.offer("Banana");
        words.addAll(List.of("Six","Apple","Or"));
        System.out.println("Without Custom Order : "+words);
        Queue<String> LowerOrderWords = new PriorityQueue<>(new LowerLengthOrder());
        LowerOrderWords.addAll(words);
        System.out.println("Lower Length Ordered Queue: "+LowerOrderWords);
        Queue<String> HigherOrderWords = new PriorityQueue<>(new HigherLengthOrder());
        HigherOrderWords.addAll(words);
        System.out.println("Higher Length Ordered Queue: "+HigherOrderWords);

    }
}


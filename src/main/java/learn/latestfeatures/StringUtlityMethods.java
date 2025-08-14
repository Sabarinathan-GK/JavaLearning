package learn.latestfeatures;

import java.util.Optional;

public class StringUtlityMethods {
    public static void main(String[] args) {
        System.out.println("".isBlank());
        System.out.println(" L R ".strip().replace(" ","#"));
        System.out.println(" L R ".stripLeading().replace(" ","#"));
        System.out.println(" L R ".stripTrailing().replace(" ","#"));
        System.out.println(" L R ".stripIndent().replace(" ","#"));
        String sentence = "this is Sentance\nwhich have multiple lines\nto demonstrate the lines methods";
        sentence.lines().forEach(System.out::println);
        System.out.printf(("UPPER".transform(e -> e.substring(2))));
        System.out.println("My name is %s and my age is %d".formatted("Sabari",23));
    }
}

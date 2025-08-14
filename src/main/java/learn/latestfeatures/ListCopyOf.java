package learn.latestfeatures;

import java.util.ArrayList;
import java.util.List;

public class ListCopyOf {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Sabarinathan","Shalini","Dhamo","Vicky")); //Getting values from DB.
        System.out.println(names);
        addName(names);
        System.out.println(names);
        List<String> immutableList = List.copyOf(names);
        System.out.println(immutableList);
        addName(immutableList);
    }

    private static void addName(List<String> names) {
        names.add("Cognizant");
    }
}

package learn.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> names = new CopyOnWriteArrayList<>();

        names.add("Sabari");
        names.add("Shalini");
        names.add("vicky");
        //consuming 1000 names and sync 
        for(String name : names){
            System.out.println(name);
        }

    }
}

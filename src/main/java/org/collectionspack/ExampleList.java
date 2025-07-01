package org.collectionspack;
import java.util.*;
public class ExampleList {
    public static void main(String[] args) {
        List<String> Animals = new ArrayList<String>();
        Animals.add("Dog");
        Animals.add("Cat");
        Animals.add("Tiger");
        Animals.add("Lion");
        Animals.add("Cheeta");
        System.out.println(Animals);
        List<String> newAnimals = new ArrayList<>();
        newAnimals.add("Cow");
        newAnimals.add("Goat");
        newAnimals.add("Monkey");
        newAnimals.add("Horse");
        System.out.println(newAnimals);
        Animals.addAll(newAnimals);
        System.out.println(Animals);
        newAnimals.addAll(2,Animals);
        System.out.println(newAnimals);
        newAnimals.set(7,"Donkey");
        System.out.println(newAnimals);
        newAnimals.remove("Dog");
        System.out.println(newAnimals);
        newAnimals.remove(8);
        System.out.println(newAnimals);
        System.out.println(newAnimals.get(1));
        System.out.println("Normal For Loop");
        for(int i=0; i<newAnimals.size(); i++){
            System.out.println(newAnimals.get(i));
        }
        System.out.println("Enhance For Loop");
        for(String word : newAnimals){
            System.out.println(word);
        }
        System.out.println("Iterator");
        Iterator newAnimalIterator = newAnimals.iterator();
        while(newAnimalIterator.hasNext()){
            System.out.println(newAnimalIterator.next());
        }
    }
}

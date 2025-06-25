package org.collectionspack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListByArrayList {
    public static void main(String[] args) {
        System.out.println("Immutable List  using List.of()");
        //List AnimalImmutable = List.of("String","Character",1,1.0,2.0f);
        List AnimalImmutable = List.of("Dog","Horse","Cat","Cow","Donkey","Monkey");
        System.out.println("Immutable List :"+AnimalImmutable);
        System.out.println("Mutable List using ArrayList");
        List<String> Animals = new ArrayList<>(AnimalImmutable);
        System.out.println("Mutable List: "+Animals);
        Animals.add("Bear");
        System.out.println("After adding Bear in List: "+Animals);
        Animals.add(5,"Tiger");
        System.out.println("After adding Tiger at 5th Position in List: "+Animals);
        List newAnimals = List.of("Rabbit","Lion","Pig");
        System.out.println("New Animal List : "+newAnimals);
        Animals.addAll(newAnimals);
        System.out.println("After adding newAnimals to Animal List: " +Animals);
        List newAnimal2 = List.of("Goat","Fox");
        System.out.println("newAnimal2: "+newAnimal2);
        Animals.addAll(2,newAnimal2);
        System.out.println("After adding newAnimal2 into Animal list at position 2: "+Animals);
        System.out.println("Size of Animal : "+Animals.size());
        System.out.println("Position of Goat using IndexOf : "+Animals.indexOf("Goat"));
        System.out.println("Lastindexof Monkey : "+Animals.lastIndexOf("Monkey"));
        System.out.println("Getting x position element in list : "+Animals.get(8));
        Animals.remove("Pig");
        System.out.println("Removing the element by Value (pig): "+Animals);
        Animals.remove(4);
        System.out.println("Removing the element by Position 4 : "+Animals);
        Collections.sort(Animals);
        System.out.println(Animals);
    }
}

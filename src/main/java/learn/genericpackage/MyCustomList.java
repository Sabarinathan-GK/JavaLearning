package learn.genericpackage;

import java.util.ArrayList;

public class MyCustomList<T> {
    private ArrayList<T> input = new ArrayList<>();
    public void addElement(T element){
        input.add(element);
    }
    public void removeElement(T element){
        input.remove(element);
    }
    public T getElement(int position){
        return input.get(position);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "input=" + input +
                '}';
    }
}

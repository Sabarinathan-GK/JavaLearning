package learn.genericpackage;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

    static <X> X doubleValue(X number){
        return number;
    }

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }

    public static void main(String[] args) {
        MyCustomList<String> cusList = new MyCustomList<>();
        cusList.addElement("StringValue");
        cusList.addElement("StringValue1");
        cusList.addElement("StringValue2");
        cusList.addElement("StringValue3");
        cusList.addElement("StringValue4");
        System.out.println(cusList);
        cusList.removeElement("StringValue4");
        System.out.println(cusList);
        System.out.println(cusList.getElement(2));

        MyCustomList<Integer> cusIntList = new MyCustomList<>();
        cusIntList.addElement(0);
        cusIntList.addElement(1);
        cusIntList.addElement(2);
        cusIntList.addElement(3);
        cusIntList.addElement(4);
        System.out.println(cusIntList);
        cusIntList.removeElement(4);
        System.out.println(cusIntList);
        System.out.println(cusIntList.getElement(2));

        GenericWRestriction<Integer> genInt = new GenericWRestriction<>();
        genInt.addElement(99);
        genInt.addElement(100);
        genInt.addElement(102);
        //genInt.addElement((103.2));

        GenericWRestriction<Double> gendouble = new GenericWRestriction<>();
        gendouble.addElement(99.99);
        gendouble.addElement(100.9);
        gendouble.addElement(102.9);

        String out = doubleValue("Do Something");
        int value = doubleValue(Integer.valueOf(88));
        double valueDo = doubleValue(Double.valueOf(109.9));
        ArrayList<String> outList = doubleValue(new ArrayList<>(List.of("st4","Str1")));

        ArrayList<Integer> values = new ArrayList(List.of(1,2,3,4,5,6,7));
        duplicate(values);
    }
}


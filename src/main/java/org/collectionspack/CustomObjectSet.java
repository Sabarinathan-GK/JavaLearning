package org.collectionspack;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class Data<K extends Integer, V extends String>{

    private K key;

    private V value;

    public Data(K key, V value) {

        this.key = key;

        this.value = value;

    }

    public K getKey() {

        return key;

    }

    public V getValue() {

        return value;

    }

    @Override

    public String toString() {

        return "Data{" +

                "key=" + key +

                ", value='" + value + '\'' +

                '}';

    }

}


public class CustomObjectSet {

    public static void main(String args[]){

        Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

            @Override

            public int compare(Data<Integer, String> Obj1, Data<Integer, String> Obj2) {

                if(Obj1.getKey() < Obj2.getKey()){

                    return -1;

                }else if(Obj1.getKey() > Obj2.getKey()){

                    return 1;

                }else{

                    return 0;

                }

            }

        };

        Set<Data<Integer, String>> customObjectSet = new HashSet<>();

        customObjectSet.add(new Data(1,"Sabari"));

        customObjectSet.add(new Data(2,"Science"));

        customObjectSet.add(new Data(3,"SocialScience"));

        customObjectSet.add(new Data(1,"Maths"));

        customObjectSet.add(new Data(4,"Computer Science"));

        customObjectSet.add(new Data(5,"Sabari"));

        customObjectSet.add(new Data(6,"English"));

        System.out.println(customObjectSet);

        for(Data temp : customObjectSet){

            System.out.println(temp);

        }

        Set<Data<Integer, String>> customTreeObjectSet = new TreeSet<>(COMPARE_KEY);

        customTreeObjectSet.add(new Data(1,"Sabari"));

        customTreeObjectSet.add(new Data(2,"Science"));

        customTreeObjectSet.add(new Data(3,"SocialScience"));

        customTreeObjectSet.add(new Data(4,"Computer Science"));

        customTreeObjectSet.add(new Data(5,"Maths"));

        customTreeObjectSet.add(new Data(6,"English"));

        customTreeObjectSet.add(new Data(4,"Sabari"));

        System.out.println(customTreeObjectSet);

    }

}


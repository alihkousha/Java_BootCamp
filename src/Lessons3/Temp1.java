package Lessons3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Temp1 {
    public static void main(String[] args) {
        //This list type doesn't save duplicate data.
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(10);
        values.add(14);
        values.add(12);
        values.add(10);
        values.add(10);
        values.add(18);
        for (int value : values){
            System.out.println(value);
        }
        HashSet<Animal> Animals = new HashSet<Animal>();
        //classes are not equal cause they are not saved in same place at memory
        Animals.add(new Animal("Tiger",12));    
        Animals.add(new Animal("Tiger",12));    
        Animals.add(new Animal("Leopard",10));    
        Animals.add(new Animal("Leopard",10));    
        Animals.add(new Animal("Lion",8));
        Animals.add(new Animal("Lion",8));
        
        for (Animal animal : Animals){
            System.out.println(animal.toString());
        }
        
        ArrayList<String> randomlist = new ArrayList<String>();
        randomlist.add("Toothpaste");
        randomlist.add("Tooth Brush");
        randomlist.add("Random");
        randomlist.add("Car");
        randomlist.add("Clothes");

        Collections.sort(randomlist);
        System.out.println(randomlist);

        for (String item : randomlist){
            System.out.println(item);
        }

        //dictionaries in java
        HashMap<Integer,String> Dictionary = new HashMap<Integer,String>();
        ArrayList<String> valuess = new ArrayList<String>();
        valuess.add("a");
        valuess.add("b");
        valuess.add("c");
        valuess.add("d");
        for (int i = 0;i<4;i++){
            Dictionary.put(i+1, valuess.get(i));
        }
        System.out.println(Dictionary);

        for(int key : Dictionary.keySet()){
            System.out.println(Dictionary.get(key));
        }
    }
}


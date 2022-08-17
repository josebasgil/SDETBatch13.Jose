package com.syntax.javaclass29;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo05 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); // auto upcasting does not work with wrappers, we have to doit manually
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",50.5);
        fruit.put("Peach",10.5);

        Set<String> keys=fruit.keySet();

        /*for (String key:keys){
            if (key.contains("e")){
                fruit.remove(key);
            }
            // it doesnt work because we are trying to modify the size of the Map and is not allowed
        }*/
        /* This is OK
        Iterator<String> iterator=keys.iterator();
        while (iterator.hasNext()){
            if (iterator.next().contains("e")){
                iterator.remove();
            }
        }*/
        keys.removeIf(key -> key.contains("e")); // a shorter way
        System.out.println(fruit);
    }
}

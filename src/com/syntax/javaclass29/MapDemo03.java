package com.syntax.javaclass29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); // auto upcasting does not work with wrappers, we have to doit manually
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",50.5);
        fruit.put("Peach",10.5);
        Set<String> keys=fruit.keySet();
        for(String key:keys){
            System.out.println("key: "+key);
        }

        Collection<Double> values=fruit.values();
        for (Double value:values){
            System.out.println("Value: "+value);
        }

    }
}

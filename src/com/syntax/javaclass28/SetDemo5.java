package com.syntax.javaclass28;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo5 {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);
        Iterator<String> iterator= fruit.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }
        System.out.println("");
        for(String frt:fruit){
            System.out.print(frt+", ");
        }
    }
}

package com.syntax.javaclass28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class setDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit); //LinkedHashSet maintains list order
    }
}

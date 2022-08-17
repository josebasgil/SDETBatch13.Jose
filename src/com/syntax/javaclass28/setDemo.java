package com.syntax.javaclass28;

import java.util.HashSet;

public class setDemo {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);// HashSet doen't alow duplicates
        // on the other hand, Hashset shows the order randomly
    }
}

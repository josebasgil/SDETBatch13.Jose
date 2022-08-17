package com.syntax.javaclass33;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Carlos");
        names.add("Luis");
        names.add("Jakobo");
        names.add("Alberto");
        System.out.println(names);
        // the follows are other types of loops, follows are special syntax smaller
        names.forEach(System.out::println);
        names.forEach(name-> System.out.println(name.length()));
        names.removeIf(name->name.contains("k"));
        System.out.println(names);
        System.out.println(names.contains("Jose"));
    }
}

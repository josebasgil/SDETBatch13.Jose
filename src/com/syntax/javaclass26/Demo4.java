package com.syntax.javaclass26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Paco");
        names.add("Paca");
        names.add("Poco");
        names.add("Poca");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
    }
}

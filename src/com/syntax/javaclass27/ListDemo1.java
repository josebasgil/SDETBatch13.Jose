package com.syntax.javaclass27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // we can store the object of a class inside a variable of type parent class
        // interface if that class implements that interface
        List<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Yusuf");
        legends.add("Abdul");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Burham"));
        System.out.println(legends.contains("Hamid"));
        String [] arr= (String[]) legends.toArray();
        System.out.println(Arrays.toString(arr));
        legends.remove("Hamid");
        System.out.println(Arrays.toString(arr));
    }
}

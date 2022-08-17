package com.syntax.javaclass30;
/*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */

import java.util.HashMap;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) {
        HashMap<Integer,String> Items=new HashMap<>();
        Items.put(123456,"Printer");
        Items.put(654321,"Iphone");
        Items.put(121212,"TV");
        Items.put(232323,"Refrigerator");
        Items.put(343434,"Ipad");
        for (Map.Entry<Integer,String> entry:Items.entrySet()){
            System.out.println(entry);
        }
    }
}

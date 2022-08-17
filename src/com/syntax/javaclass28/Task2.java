package com.syntax.javaclass28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an arrayList of cars and retrieve all the values using 3 different ways
        */
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Togg");
        cars.add("AUDI A4");
        cars.add("TESLA X");
        cars.add("TOYOTA GANDE");
        for(String car:cars){
            System.out.print(car+", ");
        }
        System.out.println(" ");
        for (int i=0;i<cars.size();i++){
            System.out.print(cars.get(i)+", ");
        }
        System.out.println(" ");
        System.out.println(cars);
        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

    }
}

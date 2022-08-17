package com.syntax.javaclass28;

import java.util.ArrayList;

public class ListDemo02 {
    public static void main(String[] args) {

        ArrayList<Flower> flower=new ArrayList<>();
        flower.add(new Rose());
        flower.add(new Lilly());
        flower.add(new Flower());

        for(Flower flower1:flower){
            flower1.Bloom();
        }
    }
}
class Flower{
    void Bloom(){
        System.out.println("Generally flower in spring");
    }
}
class Rose extends Flower{
    @Override
    void Bloom() {
        //super.Bloom();
        System.out.println("Bloom in April");
    }
}
class Lilly extends Flower{
    @Override
    void Bloom() {
        //super.Bloom();
        System.out.println("Bloom in Summer");
    }
}

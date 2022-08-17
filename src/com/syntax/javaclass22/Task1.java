package com.syntax.javaclass22;

public class Task1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */
    static void area(double length, double width){
        System.out.println("Area rectangle= "+(length*width));
    }
    static void area(double length){
        System.out.println("Area of square = "+(length*length));
    }
    static void area(double len, double wid, double hi){
        System.out.println("volume of box= "+(len*wid*hi));
    }

    public static void main(String[] args) {
        area(10);
        area(10,12);
        area(12,12,13);


    }
}

package com.syntax.javaclass18;

public class Car {

    String make;
    String model;
    String color;

    public Car(){

    }

    public Car(String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }

    public Car (String carModel){
        model=carModel;
    }
    void printInfo (){
        System.out.println("Make: "+make+", Model: "+model+", Color: "+color);
    }

    void printCarModel(){
        System.out.println("Model: "+model);
    } // Is not allowed two constructors in a class with same number of parameters and same
}

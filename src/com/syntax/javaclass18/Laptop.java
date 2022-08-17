package com.syntax.javaclass18;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop(String make, String model) {
        this.make = make;
        this.model = model;

    }
    public Laptop(String make, String model, String storage) {
        //this.make = make;
        //this.model = model;
        this (make, model);
        this.storage = storage;

    }
    public Laptop(String make, String model, String storage, String memory, double screenSize) {
        //this.make = make;
        //this.model = model;
        //this.storage = storage;
        this(make, model, storage);
        this.memory = memory;
        this.screenSize = screenSize;
    }
}

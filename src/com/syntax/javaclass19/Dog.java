package com.syntax.javaclass19;

class Animal{ // this variables extends to cat and dog
    String name;
    String breed;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name "+name+" color "+color);
    }
}

public class Dog extends Animal {
    Dog(String name, String color) {
     this.name=name;
     this.color=color;
    }
}

class Cat extends Animal{
    Cat(String name, String color) {
        this.name=name;
        this.color=color;
    }
}

package com.syntax.javaclass20;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    void printInfo() {
        System.out.println("name " + name + " color " + color);
    }

    Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
}
class parrot extends Bird{

    parrot(String name, String color, int age, double weight){
        super(name,color,age,weight); // call the constructor in the main father class replace codes below
      /*
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
       */
    }

}

class sparrow extends Bird{
    sparrow(String name, String color, int age, double weight){
        super(name,color,age,weight);
    }

}



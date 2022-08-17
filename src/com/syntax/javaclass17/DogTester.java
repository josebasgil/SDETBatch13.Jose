package com.syntax.javaclass17;

public class DogTester {
    public static void main(String[] args) {
        Dog dog=new Dog("Joffy", "Russian", "Black", 15, 20);
        // because the constructor in the other class Dog
        dog.printInfo();
    }
}

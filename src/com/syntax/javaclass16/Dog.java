package com.syntax.javaclass16;

public class Dog {
    static String name;
    String color;

    public static void main(String[] args) {
        Dog dog1=new Dog(); // creating an object of Dog Class
        dog1.name="Tommy";
        dog1.color="Pink";

        Dog dog2=new Dog();
        dog2.name="Fido";
        dog2.color="Black";

        Dog dog3=new Dog();
        dog3.name="jajaja";
        dog3.color="White";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name); // Result is 3 cases "jajaja" because name is static and has space for 1
    }
}

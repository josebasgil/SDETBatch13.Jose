package com.syntax.javaclass19;

public class Parent {
    String name="Misha";
    double money=1000000;

}

class Child extends Parent{ // "extends Parent" in order to inheritance from parent class
    void printInfo(){
        System.out.println("My full name is Khristina "+name);
    }
    void buyCar(){
        System.out.println("Hehehe buing car from Papas money "+money);
    }
}

class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
        child.buyCar();
    }
}

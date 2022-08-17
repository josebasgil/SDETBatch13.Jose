package com.syntax.javaclass25;

public interface Animal {
    void sleep();
    void eat();
}

interface Dog extends Animal{
    void bark();
}

class Husky implements Dog{
    @Override
    public void sleep() {
        System.out.println("Sleep 5 hours");
    }

    @Override
    public void eat() {
        System.out.println("eat meat");
    }

    @Override
    public void bark() {
        System.out.println(" a lot ");
    }
}
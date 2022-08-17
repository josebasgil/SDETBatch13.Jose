package com.syntax.javaclass19;

public class HumanTester extends Human{
    boolean goodWithJava;
    HumanTester(String name, String eyeColor, String job, int age, boolean goodWithJava){
        this.name=name;
        this.eyeColor=eyeColor;
        this.job=job;
        this.age=age;
    }
    void printInfo(){

        System.out.println("My name is "+name+" I do "+job+" and I am good with Java "+goodWithJava);
    }

    public static void main(String[] args) {
        HumanTester sdet=new HumanTester("Jose Bas","brown","Engineer",39,true);
        sdet.printInfo();
    }
}

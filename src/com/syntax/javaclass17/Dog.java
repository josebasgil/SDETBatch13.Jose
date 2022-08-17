package com.syntax.javaclass17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){ // constructor which is a block of code
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
        // here I can write tools like conditionals, switch or forloop then in dogtester the filling of information
        // will be under the rules I create in this constructor
    }

    void printInfo(){
        System.out.println("Name "+name+" breed "+breed+" color "+color+" weight "+weight);
    }

    public static void main(String[] args) {
     /*   Dog dog1=new Dog(); In this case dog() is a empty constructor so Java create a default constructor
        dog1.name="lofy";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=11;
        dog1.weight=20;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="TEO";
        dog2.breed="Golden";
        dog2.color="Gold";
        dog2.age=12;
        dog2.weight=36;
        dog2.printInfo();

      */
    }
}

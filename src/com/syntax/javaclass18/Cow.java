package com.syntax.javaclass18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow (String breed, String color, int age, double weight){
        // when we have same name variables as local and as instance inside a class, always local variables are prefer
        // over instances variables by java in block of code
        // Then you add this.breed to solve it. is when the name in the variables and in the constructor are equals
       this.breed=breed;
       this.color=color;
       this.age=age;
       this.weight=weight;
    }
    String printCowInfo(){
        return "Breed: "+breed+", Color: "+color+", Age: "+age+", Weight: "+weight;
    }
}

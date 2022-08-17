package com.syntax.reviewclass07;

import com.syntax.javaclass20.Laptop;

public class AppleLaptop extends Laptop {
    void printMaker(){
        System.out.println(maker); // I cannot access because I am in a different package but if in the source I
        // put "public String maker;", it allows to be accessed from other package like this case.
        // Check the function of "protected". Also allows to access maker from different package
    }
}

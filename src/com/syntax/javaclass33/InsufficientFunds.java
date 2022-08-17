package com.syntax.javaclass33;

public class InsufficientFunds extends RuntimeException {
    // To create a custom exception simple creat a class and extend it from RuntimeException or any other exception
    // if you want to create a checked exception class otherwise RuntimeException
    // In sumary, this method is when you want an exception that is not paramethized
    InsufficientFunds(String message){
        super(message);
    }
}

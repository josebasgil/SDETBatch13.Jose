package com.syntax.javaclass15;

public class Task2 {
    // create a method that will take a number and prints whether the number is even or odd
    void PrintEvenOrOdd (int num){
        if(num%2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    public static void main (String[] args){
        Task2 task2= new Task2();
        task2.PrintEvenOrOdd(7);
    }
}

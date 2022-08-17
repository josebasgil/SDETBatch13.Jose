package com.syntax.javaclass21;

public class MethodOverLoading2 {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2, double num3){
        System.out.println(num1+num2+num3);
    }
    static void add(double num1, double num2, double num3, double num4){
        System.out.println(num1+num2+num3+num4);
    }
    public static void main(String[] args) {
        add(20,20);

    }
}

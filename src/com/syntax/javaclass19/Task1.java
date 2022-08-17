package com.syntax.javaclass19;

public class Task1 {
    /*
    Create a method that will take a String as a parameter
    and returns reversed string
    method should be available to all classes within
    your project and accesible by class name
     */

    public static String reverseString(String str){ // the "public" allows to be available to all classes
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str="monday";
        System.out.println(Task1.reverseString(str));
    }
}

package com.syntax.javaclass19;

public class Task3 {
    /*
    Create a method that will accept a string as a parameters and return a new string
    that consist only of vowels. Method shoyld be available inside the class only where it was
    declared and executed by calling it is name
     */

    private static String getVowels(String input){
        return input.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(getVowels("Emre"));
    }
}

package com.syntax.javaclass15;

import com.sun.deploy.util.StringUtils;

public class Task3 {
    // Create a method that will print whether given String is palindrome or not
    void printIsPalindrome (String str){
        StringBuilder stringBuilder= new StringBuilder(str);
        stringBuilder.reverse();
        String reversedstr=stringBuilder.toString();
        if(str.equals(reversedstr)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is NOT palindrome");
        }
    }
    public static void main (String[] args){
        Task3 task3= new Task3();
        task3.printIsPalindrome("dad");
        task3.printIsPalindrome("Aladin");

    }
}

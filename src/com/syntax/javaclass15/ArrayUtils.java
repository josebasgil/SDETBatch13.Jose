package com.syntax.javaclass15;

public class ArrayUtils {
    // print a method for an array so makes not necessary to use a loop
    void PrintArray (int [] arr) {
        for (int num:arr){
            System.out.println(num);
        }
    }
    int SumArray(int [] arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        return sum;
    }
}

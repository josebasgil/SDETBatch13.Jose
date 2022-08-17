package com.syntax.javaclass20;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr={10,20,10,30,40,40};
        System.out.println((Arrays.toString(removeDuplicates(arr))));
    }
    static int[] removeDuplicates(int [] arr) {
        int[] newArr = new int[arr.length]; // to store elements that are not duplicate
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    newArr[i] = arr[i];
                    counter++;
                }
            }
        }
        System.out.println(counter);
        int [] arr2=new int[arr.length-counter];
        int counter2=0;
        for (int e:arr){
           // if(!isPresent(e,duplicateElementsArr)){
             //   arr2[counter2++]=e;
           // }
        }
        return newArr;

    }
    boolean isPresent(int element, int[] arr){
        for(int e:arr){
            if(element==e){
                return true;
            }
        } return false;
    }
}

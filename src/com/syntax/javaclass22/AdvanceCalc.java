package com.syntax.javaclass22;

public class AdvanceCalc {
    /*void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
    void sum(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    void sum(int num1, int num2, int num3, int num4){
        System.out.println(num1+num2+num3+num4);
    }

     */
    static void sum(int ... arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void printNames(String ... names){
        for (String name:names){
            System.out.print(name+" ");
        }
    }
    public static void main(String[] args) {
        sum(2,2,3); // Replace the code above, don't need to write a void for certain number of nums, is not
        // limited for number of elements, we don't need to define number of elements
        //printNames("Aladeen,", "Jose", "Carlos");
        int age=10;
        String name;
        if(age>18){
            name="Time to go to work";
        } else{
            name="Enjoy no work";
        }
        System.out.println(name);
        String name2=age>18?"Time to go work":"Enjoy no Work"; // this code replace all conditional above
        System.out.println(name2);
        String name3=age>18?age>10?"nested in?":"It is nested else":"Enjoy no Work"; // this code replace nested if
        System.out.println(name3);
        // the name of that codes are "ternary operators"
    }



}

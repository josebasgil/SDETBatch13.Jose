package com.syntax.javaclass19;

public class Task8 {
    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;
    Task8(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Task8 str=new Task8("Jose","Golf Los Incas 320");
        str.displayInfo();
    }
}

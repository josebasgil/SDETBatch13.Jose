package com.syntax.javaclass16;

public class InstanceDemo {
    String str="instance";
    void method1(){
        str="method1";
    }
    void method(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id= new InstanceDemo();
        System.out.println(id.str); // Print value of str which is instance
        id.method(); // method once simple prints the value of str which is still istance
        id.method1(); // this method changes the instance variable value which will be not captain marvel
        id.method(); // method once simple prints the value of str which is now instance captai marvel
    }
}

package com.syntax.javaclass22;

public class Task2 {
    /*
    Create a class named 'Programming'.
    While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed. If some String is passed to it,
    then in place of "programming languages" the value variable should be printed.
    Example, if we pass "Java", then "I love Java”
     */
    static void sayHello(){
        System.out.println("Hello Batch 13");
    }
    static void sayHello(String msg){
        System.out.println(msg);
    }
    static void sayHello(String msg, int times){
        for (int i=0;i<times;i++){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        sayHello("Zameer stop wasting time on IG");
        sayHello();
        sayHello("Cosas",4);
    }
}

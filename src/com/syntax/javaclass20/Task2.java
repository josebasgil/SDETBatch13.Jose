package com.syntax.javaclass20;

public class Task2 {
    /*
    Write program to inherit class G that has method printF
which is static and call or reuse that method into class E
     */
    //E.printF();

}
class G{
    public static void main(String[] args) {
        System.out.println("Method print F in class G");
    }
}
class E extends G{

        }

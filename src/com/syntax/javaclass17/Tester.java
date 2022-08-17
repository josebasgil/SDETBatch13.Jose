package com.syntax.javaclass17;

import com.syntax.javaclass16.Dog;

public class Tester {
    public static void main(String[] args) {
         /*
    If classes exist inside the same package
    they are imported automatically
     */
        //manager="I can't access"; We can import just classes, different classes
        Employee employee=new Employee();
        employee.name="Mike";
        //employee.salary=125000; is not possible to access this variable because is private in the other class
        employee.department="IT saver";
        //employee.printSalary(); be cause is private, we cannot access.

        Dog dog=new Dog();
    }

}

package com.syntax.javaclass19;

public class Task5 {
    /*
     Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    double g1Marks;
    double g2Marks;
    double g3Marks;
    String name;
    Task5(String name, double grad1Marks, double grad2Marks, double grad3Marks) {
    g1Marks=grad1Marks;
    g2Marks=grad2Marks;
    g3Marks=grad3Marks;
    this.name=name;// because we have sae name variable inside the constructor
    }


    public void calculateAvGrade() {
    double avgGrade=(g1Marks+g2Marks+g3Marks)/3;
        System.out.println(name+" "+avgGrade);
    }


}
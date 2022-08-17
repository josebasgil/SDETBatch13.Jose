package com.syntax.javaclass19;

public class Task5Tester {
    public static void main(String[] args) {
        Task5 student=new Task5("Best Student Oskan",99, 98, 87);
        Task5 student2=new Task5("Jose", 54, 65, 67);
        student.calculateAvGrade();
        student2.calculateAvGrade();
    }
}

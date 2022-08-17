package com.syntax.javaclass17;

public class TeacherClass {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Zombie";
        teacher.SchoolName="Mavard";
        teacher.printInfo();
        // These variables are accesed from the class Teacher in the same package
        // because print info from teacher class is public, we can call it in other clasess and because
        // ists the part of the teacher class it can access the private fields which in turn let us access
        // those fields
    }
}

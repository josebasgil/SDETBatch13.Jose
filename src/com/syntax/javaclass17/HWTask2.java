package com.syntax.javaclass17;

public class HWTask2 {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        HWTask2 students1=new HWTask2();
        students1.name="Arif007";
        students1.id="JB123";
        numberOfStudents=1; // because is static, is not needed to access with the objet student1.numberOfStudent, just directly

        HWTask2 students2=new HWTask2();
        students2.name="Jose";
        students2.id="JB456";
        numberOfStudents=2;

        System.out.println(students1.name);
        System.out.println(students1.id);
        System.out.println(numberOfStudents);

        System.out.println(students2.name);
        System.out.println(students2.id);
        System.out.println(numberOfStudents);
    }
}

package com.syntax.javaclass17;

public class HWTask1 {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
    String empId; // Instance because each employee might have its own Id
    int salary; // Also Instance, each employee has different values for salary
    static String CEO="Sumair"; // Static because is just 1 CEO

    public static void main(String[] args) {
        HWTask1 emp1=new HWTask1();
        emp1.empId="123";
        emp1.salary=200000;

        HWTask1 emp2=new HWTask1();
        emp2.empId="456";
        emp2.salary=250000;

        System.out.println(emp1.empId);
        System.out.println(emp1.salary);

        System.out.println(emp2.empId);
        System.out.println(emp2.salary);
    }

}

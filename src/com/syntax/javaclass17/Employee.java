package com.syntax.javaclass17;

public class Employee {

    public String name;
    public static String manager="Cindy";

    private int salary;
    String department; // because we didnt specify if is private or public, by default is public

    private void printSalary(){
        System.out.println("Salary "+salary);
    }

    void printDepartment (){
        System.out.println("Department "+department);
    }

    public void printName(){
        System.out.println(name);
    }

    public static void printManager(){
        System.out.println(manager);
    }

    public static void main(String[] args) {
    Employee emp=new Employee();
    emp.name="Jason";
    emp.department="IT Destroyer";
    emp.salary=150000;
    emp.printDepartment();
    emp.printName();
    emp.printSalary();
    }
}

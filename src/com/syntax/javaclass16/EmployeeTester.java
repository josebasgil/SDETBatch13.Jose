package com.syntax.javaclass16;

import com.syntax.javaclass17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Merve"; // we can access because is public we access this variable from a differente package
        // salary cannot be accessed because is private
        // we can access employee.department because is String department and system consider this a default variable.
        // methods is the same, if private, we cannot access if is public we can access is not private or public is a default and cannot be accessed neither
        System.out.println(Employee.manager);
        Employee.printManager();
        // Static fields and methods can also be accessed by just writing the name of the class
    }
}

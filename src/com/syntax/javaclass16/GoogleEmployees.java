package com.syntax.javaclass16;

public class GoogleEmployees {
    String name;
    double salary;
    static int noOfEmployees;
    static String companyName="Google";

    void displayEmployeeInfo(){
        System.out.println("Name "+name+" salary "+salary+" company name "+companyName);
    }
    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Oleg";
        emp1.salary=250000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();
    }
}

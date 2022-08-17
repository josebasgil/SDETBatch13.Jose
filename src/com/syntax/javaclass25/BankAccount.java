package com.syntax.javaclass25;

public class BankAccount {
    String name;
    String username;
    String password;
    double balance;
    int age;
    public void setName(String name){
        // 123Elexia
        String nameWithoutNumbers=name.replaceAll("[{^A-Za-z]","");
        if (nameWithoutNumbers.equals(name)){
            System.out.println("Numberso not present inside the name");
            this.name=name;

        }else {
            System.out.println("Only alphabet are allowed");
        }
    }
}

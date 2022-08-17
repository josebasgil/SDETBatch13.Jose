package com.syntax.javaclass33;

public class ExceptionDemo01 {
    /*
    What is printStackTrace
    it's a method that show all the details of exception
     */
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("Please check the path of the file");
            ae.printStackTrace();
            System.out.println(ae.getCause());
            System.out.println(ae.getMessage());
            System.out.println(ae);
            System.out.println();
        }
        System.out.println("Important code");
    }
}

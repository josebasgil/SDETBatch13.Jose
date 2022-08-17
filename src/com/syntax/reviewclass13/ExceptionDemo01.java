package com.syntax.reviewclass13;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            doSomething();
        } catch (NullPointerException npe){
            System.out.println("Please assign an Object to the variable");
            npe.printStackTrace();
        } catch (ArithmeticException ae){
            System.out.println("Please don't try to divide by zero");
            ae.printStackTrace();
        } catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        System.out.println("2");
    }
    public static void doSomething(){
        String name=null;
        name.length();
    }
}


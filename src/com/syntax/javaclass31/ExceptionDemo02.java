package com.syntax.javaclass31;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());
        } catch (NullPointerException npe){ // I need to know what type of exception is in order to fill it here
            System.out.println("You are trying to call a method on a null object");
        }
        try{
            String name=null;
            int [] arr={2};
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException iobe){
            System.out.println("Please check the index that you are trying to access");
        }catch (Exception other){
            System.out.println("This exception is used when there is an exception that is not in the library of execpions");
        }
    }
}

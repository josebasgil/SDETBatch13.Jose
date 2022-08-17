package com.syntax.javaclass28;

public class ListDemo01 {
    public static void main(String[] args) {
        Object[] arr= {"Hamid",10.2,"Name"};//bad programing
        for(Object obj:arr){
            if(obj instanceof String){//instanceof it checks if variable contains an specific type of objects
                System.out.println(((String)obj).length());
            }
        }
    }
}

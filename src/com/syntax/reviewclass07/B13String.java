package com.syntax.reviewclass07;

public class B13String {
    //Best practice to always try to make all of your instance variable as private
    private String str;
    public B13String(String str){
        int number;
        // this.number; error as there is no instance variable number
        this.str=str;
    }

    //write a method that can tell me how many times as character is being
    //repeated in a string
    public  int countChars(char c){
        int counter=0;
        for(char cha:str.toCharArray()){
            if(cha==c){
                counter++;
            }
        }
        return counter;
    }
    public void printChars(char c){
        int counter=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==c){
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter+" inside this string");
    }
}

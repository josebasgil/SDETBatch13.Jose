package com.syntax.javaclass15;

public class Task5 {
    /*
    Create a method createEmail(), based on values of user name, last name
    and email type, your mehod shoyld return complete email address
    example: createEmail(John, Snow, gmail) --> johnsnow@gmail.com
     */

    String completeEmail(String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main (String[] args){
        Task5 task5= new Task5();
        System.out.println(task5.completeEmail("Tara", "Sitara", "gmail"));
    }
}

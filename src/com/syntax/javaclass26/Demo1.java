package com.syntax.javaclass26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name1="Aladin";
        String name2= "Reza";
        String name3= " Ahmed";
        int size=10;
        String [] arr= new String[size]; //Max number or array equals to max num of integer
        String [] names={"Aladeen", "Resa", "Ahmedin"};
        System.out.println(names.length);
        names=new String[4];
        names[0]="Aladin";
        names[1]="Reza";
        names[2]="Ahmed";
        names[3]="Zameer";
        System.out.println(names.length);
        // new topic array list
        ArrayList<String> syntaxStudents=new ArrayList<>();
        ArrayList<Double> syntaxStudents2=new ArrayList<>();
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Riaz");
        syntaxStudents.add("Ahmed");
        syntaxStudents.add("Juan");
        System.out.println(syntaxStudents.size()); // it grows while I am adding new elements
        ArrayList<Integer> arrayTask=new ArrayList<>();
        for (int i=0;i<10;i++){
            arrayTask.add(i);
            System.out.print(arrayTask.get(i) +" ");
        }
        System.out.println(" ");
        System.out.println(arrayTask);

    }
}

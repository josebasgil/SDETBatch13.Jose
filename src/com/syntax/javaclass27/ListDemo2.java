package com.syntax.javaclass27;
import java.util.ArrayList;
import java.util.List;
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handad");

        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
    }
}

package com.syntax.class09;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		
	
		
		char[] grades2= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades2[1]);
		
		System.out.println("-----------------------");
		
		String[] names=new String[6];
		names[0]="Juan";
		names[1]="Pedro";
		names[2]="Alberto";
		names[3]="Rodrigo";
		names[4]="José";
		names[5]="Carlo";
		System.out.println(names[4]);
		String[] names2= {"Juan", "Pedro", "Alberto", "Rodrigo", "José", "Carlo" };
		System.out.println(names2[4]);
				
		System.out.println("-----------------------");
		// Another way for the char exercise
		for (int i=0; i<grades.length;i++) {
			System.out.print(grades[i]+" ");
		}
		
	}
	

}

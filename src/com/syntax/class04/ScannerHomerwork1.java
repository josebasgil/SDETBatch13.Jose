package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomerwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		
		// Creating a scanner
		Scanner input=new Scanner(System.in);
		
		// send instruction to the console
		System.out.println("Please enter your name");
		String name=input.next();// after you type the value, hit enter
		
		System.out.println("Please enter your last name");
		String lastname=input.next();
		
		System.out.println("Please enter the name of the State you live");
		String State=input.next();
		
		System.out.println(name+" "+lastname+" lives in "+State);
	}

}

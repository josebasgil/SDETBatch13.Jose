package com.syntax.reviewclass02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=scanner.nextInt(); // User enters the number and hits the enter key
		
		scanner.nextLine(); // consumes the enter that user press after the number
		
		System.out.println("Please enter your name");
		String name=scanner.nextLine();

		System.out.println(name+age+" where this will be printed");
		
		
	}

}

package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		
		System.out.println("Please enter name");
		String name=scan.next(); // Capture String
		System.out.println(name);
		
		System.out.println("Please enter age");
		int age=scan.nextInt(); // Capture Int
		
		System.out.println("Please enter price");
		double price = scan.nextDouble(); // Capture Double
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean(); // Capture Boolean
		
		System.out.println("Please enter any character");
		char character=scan.next().charAt(0); // capture 1 character
		
	}

}

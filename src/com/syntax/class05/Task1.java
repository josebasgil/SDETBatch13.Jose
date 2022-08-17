package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner (System.in);
		
		System.out.println("Please enter age");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("You can issue the driver licence");
		} else {
			System.out.println("You need to get a learners permit");
		}
		
	}

}

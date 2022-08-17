package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Monday and Friday: no class
		 * Tuesday and Wednesday: manual testing
		 * Thursday: review
		 * Saturday and Sunday: Java
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("Please enter day");
		String day=scan.next(); 
		
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have manual testing class");
		} else if (day.equals("Thursday")) {
			System.out.println("I have review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java Class");
		}
			
		
		
	}

}

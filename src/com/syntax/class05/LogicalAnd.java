package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean job=true;
		double salary=75000;
		
		if (job == true && salary >= 100000) {
			System.out.println("I am super duper happy");
		} else {
			System.out.println("I am almost happy");
		}
		
		System.out.println("----------------------------");
		
		boolean study=true;
		boolean homework=true;
		boolean practice=false;
		
		if (study && homework && practice) {
			System.out.println("You will succed in the course");
		} else {
			System.out.println("you will struggle");
		}
		
		System.out.println("----------------------------");
/* Write a program to find the largest number among three numbers using nested if provided by a use (number must be distinct)*/
		
		int num1=65;
		int num2=66;
		int num3=80;
		
		if (num1>num2 && num1>num3) {
			System.out.println("The largest number is "+num1);
		} else if (num3>num1 && num3>num2) {
			System.out.println("The largest number is "+num3);
		} else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}
		
		
		
		
		
	}

}

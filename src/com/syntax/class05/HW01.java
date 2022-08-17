package com.syntax.class05;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("EX1");
		// Ex1
		System.out.println("How much do you want for loan? (USD)");
		
		int loan=input.nextInt();
		
		if(loan<=200000) {
			System.out.println("Loan accepted");
		} else {
			System.out.println("Loan rejected");
		}
		
		System.out.println("--------------------------------------");
		System.out.println("EX2");
		// Ex2
		
		System.out.println("Please enter the name of the city");
		String city=input.next();
		
		System.out.println("Please enter the temperature in farenheit");
		double temperature=input.nextDouble();
		
		double conversion = (temperature-32)*(0.56);
		
		System.out.println("The temperature in the city "+city+" is "+conversion+" celcius.");
		
		System.out.println("--------------------------------------");
		System.out.println("EX3");
		// Ex3
		
		System.out.println("Please enter the number of worked years");
		int worked=input.nextInt();
		
		
		
		if (worked>=5) {
			System.out.println("Eligible for bonus");
			System.out.println("Please enter the annual salary");
			int salary=input.nextInt();
			
			if (salary>=50000) {
				System.out.println("Your bonus is 5000 USD");
			} else {
				System.out.println("Your bonus is 3000 USD");
			}
		} else {
			System.out.println("Rejected for bonus");
		}
		
		System.out.println("--------------------------------------");
		System.out.println("EX4");
		// Ex4
		
		System.out.println("Please enter time");
		int hour=input.nextInt();
		
		if (hour>=1 && hour<=11) { 
			System.out.println("Morning");
		} else if (hour>=12 && hour<=15) {
			System.out.println("Afternoon");
		} else if (hour>=16 && hour<=20) { 
			System.out.println("Evening");
		} else if (hour>=21 && hour<=24) {
			System.out.println("Night");
		} else {
			System.out.println("Invalid number");
		}
		
		System.out.println("--------------------------------------");
		System.out.println("EX5");
		// Ex5
		
		System.out.println("Please enter your birth month");
		String month=input.next();
		// Ignorecase allows to avoid problem for writing with lower or upper case ex: August or august
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("You were born in season Summer" );
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in season Fall" );
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in season Winter" );
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("You were born in season Spring" );
		} else {
			System.out.println("Invalid input" );
		}
		
		System.out.println("--------------------------------------");
		System.out.println("EX6");
		// Ex6
		
		System.out.println("Please enter your Quiz Score");
		double quiz=input.nextDouble();
		System.out.println("Please enter your Midterm Score");
		double midterm=input.nextDouble();
		System.out.println("Please enter your Final Score");
		double finals=input.nextDouble();
		
		double average = (quiz+midterm+finals)/3;
		
		if (average>=90) {
			System.out.println("Grade A");
		} else if (average>=70 && average<90) {
			System.out.println("Grade B");
		} else if  (average>=50 && average<70) {
			System.out.println("Grade C");
		} else if (average < 50) {
			System.out.println("Grade F");
		}
		
	}

}

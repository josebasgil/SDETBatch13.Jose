package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * declare a variable rate if rate is more than 5 then I am not buying a house
		 */

		double mortgageRate = 5.5;
		if (mortgageRate > 5) {
			System.out.println("I am not buying a house");
		}

		int num1 = 99;
		int num2 = 10;

		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		}

		/*
		 * declare temperature, if temp is higher than 75 then I will go for a walk
		 */

		int temp = 70;

		if (temp > 75) {
			System.out.println("I will go for a walk");
		} else {
			System.out.println("I am going to study Java");
		}

		char gender = 'm';

		if (gender == 'f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("you like watching sports");
		}

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("all the test cases will be executed on chrome");
		} else {
			System.out.println("I am not executing any test cases");
			System.out.println("Reason - wrong browser");
		} // without bracers, Java identify just one statement, the first line, the first
			// of if and the first of else

	}

}

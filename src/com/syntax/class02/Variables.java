package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Jose";
		
		String lastname =  "Smith";
		String city="Miami";
		String state="Florida";
		char student = 'a';
		String PhoneNumber="123-456-7890";
		System.out.println("My name is "+" and my last name is "+lastname);
		System.out.println("I am "+student+" Student.");
		System.out.println("I live in the city "+city+" and state "+state);
		System.out.println("And my phone number is "+PhoneNumber);
		
		city="Silent Hill";
		state="Unknown";
		student='b';
		PhoneNumber="997-882-529";
		System.out.println("My name is "+name+" "+lastname+" and I moved to new city "+city+" and new sate "+state+". My new phone number is "+PhoneNumber);
		
		/*
		 * Rulers for identifiers
		 * 1. no space
		 * 2. no keywords
		 * 3. cannot start with numbers (numbers can be user after the name)
		 * 4. cannot have with special characters(except _,$)
		 */

		// string break="hello";
		// int 1numner=10; This is wrong must be number1
		// int numb%=20; error
		double $price=3.99;
		float f_=2.09f;
		
		/*
		 * Naming conventions:
		 * follow camel casing
		 * variable names should start with lower case and then follow camel case
		 * class names should start with uppercase
		 */
		
		String MyCity="Tysons";
		
	}

}

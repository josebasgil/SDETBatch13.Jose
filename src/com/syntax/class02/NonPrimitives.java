package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {

		String name = "Oleg";
		
		String lastname =  "Smith";
		
		long phone = 1234567890l;
		
		// xxx-xxx-xxx
		
		String PhoneNumber="123-456-7890";
		String address="123 Washington str";
		int age=30;
		String city="Miami";
		// shortcut for printing
		// type syso +ctrl + space ---> hit enter
		/*we can use+
		 * to attach string to string
		 */
		System.out.println(name+" "+lastname);
		// Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		// Oleg is 30 years old
		System.out.println(name+" is "+age+" years old ");
	}

}

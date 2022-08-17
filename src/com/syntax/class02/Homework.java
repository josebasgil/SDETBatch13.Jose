package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		
		// whole numbers
		/*
		 * box1 - is variable
		 * to create a variable we need 2 things: datatype & name
		 */

				byte box1 = 127;
				short box2 = 32767;
				int box3 = 766666; // mostly will be used
				long box4 = 458263098833L;
				
				// decimal values
				float container1 = 1.99f;
				double container2 = 89.99;
					
				// to represent 1 character
				char gender = 'm';
				char dollar = '$';
				
				// to represent true or false (yes or no)
				boolean hungry=true;
				boolean sleepy=false;
				
				// how to access values from variable?
				
				System.out.println(container2); // calling a variable container2
				System.out.println(box1);
				System.out.println(box2);
				System.out.println(box3);
				System.out.println(box4);
				System.out.println(container1);
				System.out.println(container2);
				System.out.println(gender);
				System.out.println(dollar);
				System.out.println(sleepy); // false
				System.out.println("Sleepy"); // sleepy
				
				int box5=900;
				System.out.println(box5);
				
				int year=2022; // create a variable and store value
				System.out.println(year);
				year=2023;
				System.out.println(year);
				// access and print values from all variable
	}

}

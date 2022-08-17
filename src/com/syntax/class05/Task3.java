package com.syntax.class05;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercise 1
		int height = 74;
		
		if (height < 60) {
			System.out.println("short");
		} else if(height>=60 && height<72) {
			System.out.println("medium");
		} else if (height>72) {
			System.out.println("tall");
		}
		
		// Exercise 2
		
		int day=4;
		
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		} else if (day>=6 && day<=7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
	}

}

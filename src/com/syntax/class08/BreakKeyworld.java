package com.syntax.class08;

public class BreakKeyworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			// Break; makes stop in one interation
		}
		boolean summer=true;
		int temp=100;
		while(summer) {
			
			if (temp<70) {
			System.out.println("It is not hot anymore");
			break; // makes one time and then stop
			}
			System.out.println("It is hot");
			temp-=10; // is a decreasing temperature by 10
		}
	}

}

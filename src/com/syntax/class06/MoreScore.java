package com.syntax.class06;

import java.util.Scanner;

public class MoreScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
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

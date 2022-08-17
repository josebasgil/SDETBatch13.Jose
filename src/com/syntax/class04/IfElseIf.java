package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Declare 2 numbers and verify which one is the largest
		 */
		
		int num1=20;
		int num2=20;
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}
		
		else if(num1==num2) {
			System.out.println(num1+" is equal to "+num2);
		}
		
		else {
			System.out.println(num2+" is larger than "+num1);
		}

	}

}

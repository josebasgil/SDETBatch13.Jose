package com.syntax.class06;

public class EnhancelargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0;
		int num2=20;
		int num3=20;
		int largest=0; 
		/*
		 * compiler can initialize variables to it's default values
		 * int:0
		 * double: 0.0
		 * boolean: false
		 * String: null
		 */
		
		
		if (num1>=num2 && num1>=num3) {
			largest=num1;
		} else if (num2>=num1 && num2>=num3) {
			largest=num2;
		} else if (num3>=num1 && num3>=num2) {
			largest=num3;
		} else {
			System.out.println("all numbers are equal");
		}
		
		if(largest !=0) {
		
		System.out.println("The largest number is "+largest);
		}
		
	}

}

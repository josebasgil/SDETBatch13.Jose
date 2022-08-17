package com.syntax.class14;

public class MethodsDemo3 {
	// Write a method that taks an int value i that value is even this method
	// returns true otherwise it returns false
	boolean isEven(int number) {
		if (number%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Write a method that takes a string and returns true if number of characters in that String
	 * are even or odd
	 */
	
	boolean numbers(String word) {
		if (word.length()%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(3));
		System.out.println(md.numbers("casa"));
	}

}

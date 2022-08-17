package com.syntax.class14;

public class MethodsDemo04 {

	int sumNumbers (int num1, int num2) {
		return num1+num2;
	}
	
	void printTimes(String str, int times) {
		for (int i=0;i<times;i++) {
			System.out.println(str);
		}
	}
	
	// Write a method that takes a String and an int and printsout that String on the console
	// that many times that value that we can in int
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo04 md = new MethodsDemo04();
		System.out.println(md.sumNumbers(15, 20));
		md.printTimes("Java", 3);
	}

}

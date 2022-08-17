package com.syntax.class13;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a string and print it in reverse order (Sunday to yadnuS)
		
		String str="Sunday";
		System.out.println(str);
		for (int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}

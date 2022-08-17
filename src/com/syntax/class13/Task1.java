package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a string and if the string is not empty, perform the following:
		 * if the string has an odd number of characters ad has 3 or more characters, print the character in the middle of the string
		 */
		
		String str=new String("Hello");
		String str2="Hello"; // This is preferred
		
		if(!str2.isEmpty()) {
			if (str2.length()%2!=0&&str2.length()>=3) {
				int middle=str2.length()/2;
				System.out.println(str2.charAt(middle));
			}
		}
	}

}

package com.syntax.class12;

public class StringDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to count how many times a number or character is repeated
		String str = "1238723989928";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '9') {
				counter++;
			}
		}
		System.out.println(counter);
	}

}

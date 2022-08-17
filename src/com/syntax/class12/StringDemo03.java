package com.syntax.class12;

public class StringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Batch 13 is Great";
		System.out.println(str.startsWith("great")); // check if "great" is at the beginning of the variable str in a boolean answer
		System.out.println(str.endsWith("Great")); // check if "Great" is at the end of the variable str in a boolean answer
		System.out.println(str.endsWith("great"));
		System.out.println(str.toLowerCase().endsWith("great")); // for searching is important to convert first to lowecase
		System.out.println(str.contains("13")); // check if variable str contains "13"
	}

}

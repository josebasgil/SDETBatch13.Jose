package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Where is sameer?";
		System.out.println(str.charAt(3)); // which script is at position 3 starting from 0
		System.out.println(str.indexOf("i")); // In which position you can find the first "i" starting from 0
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("e",6)); // look position of "e" ignoring all before position 6
		
		int counter=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='e') {
				System.out.print(i+" ");
				counter++;
				
			}
		}
	}

}

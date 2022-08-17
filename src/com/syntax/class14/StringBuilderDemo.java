package com.syntax.class14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word=new String("Caramelo");
		StringBuilder words=new StringBuilder("Caramelo");
		System.out.println(words.reverse());
		/*
		 * Strung and StringBuilder both are classes that we can use to store and manipulate characters
		 * But String is inmutable and String Builder is mutable
		 * When we make a lot of changes to a String, it creates multiple copies inside uor memory and
		 * because of this reason because for every change a new variable is created
		 */
	}

}

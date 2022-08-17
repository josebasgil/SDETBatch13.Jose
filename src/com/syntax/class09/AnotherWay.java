package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits= {"mango", "apple", "kiwi", "pear", "Sandia"};
		System.out.println(fruits[2]);
		// fruits[4]="peach"; spaces are 4, [4] is a 5th
		System.out.println("My favorite fruit is "+fruits[0]);
		// I want to find a size of an array/how many elements?
		int size=fruits.length;
		System.out.println(size);
	}

}

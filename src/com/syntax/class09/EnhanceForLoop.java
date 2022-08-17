package com.syntax.class09;

public class EnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Enhanced for loop/advanced for loop/for each loop
		/*
		 * for each loop can be used only when we work with array
		 * or
		 * collections
		 */
		
		String[] colors= {"Pink", "Blule", "White", "Black"};
		for(String color:colors) {
			
			System.out.print(color+" ");
		}
		
		int[] numbers= {10, 20, 30, 40};
		for(int number:numbers) {
			
			System.out.print(number+" ");
		}
		
	}

}

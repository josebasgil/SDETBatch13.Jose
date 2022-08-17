package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=9;
		if (time<12) {
			System.out.println("morning"); // 1
		}
		System.out.println("-----------------------------");
		
		/*
		 * while (time<12) {
			System.out.println("morning"); // Infinite
			}
		 */
		while (time<12) {
			System.out.println("Morning");
			time++;
		}
		System.out.println("Hello");
		
	}

}

package com.syntax.reviewclass02;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in); // Allows you to take the input om the keyboard
		System.out.println("Print Enter your Account Balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("Please enter the amount that your want to lend to your friend");
		double amountToLend=scanner.nextDouble();
		
		if (accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		} else {
			System.out.println("Sorry I don't have enough money to help you");
		}
	}

}

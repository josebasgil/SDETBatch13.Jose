package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Do you have a credit card?");
		boolean credit=input.nextBoolean();
		
		if (credit==false) {
			System.out.println("I offer you a credit card");
		} else {
			System.out.println("Would you tell me the balance of your credit card?");
			int balance=input.nextInt();
			if (balance>=1000) {
				System.out.println("You should pay off inmediatly");
			} else {
				System.out.println("You can spend more");
			}
		}

	}

}

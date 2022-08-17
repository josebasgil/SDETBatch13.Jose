package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter the number 1");
		int num1=input.nextInt();
		
		System.out.println("please enter the number 2");
		int num2=input.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}
		
		else if(num1==num2) {
			System.out.println(num1+" is equal to "+num2);
		}
		
		else if(num2>num1) {
			System.out.println(num2+" is larger than "+num1);
		}
		
	}

}

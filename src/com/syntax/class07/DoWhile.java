package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// While loop first checks condition
		// and only then executes block of code
		int num=1;
		while (num<=3) {
			System.out.println(num+" ");
			num++;
		}
		
		System.out.println("----------------------");
		
		int num1=1;
		// do while first execute the code
		// and only then checks de conditions
		do {
			System.out.println(num1+" ");
			num1++;
		} while(num1<=3);
		
System.out.println("----------------------");
		
		int num2=1;
		// do while first execute the code
		// and only then checks de conditions
		do {
			System.out.print(num2+" ");
			num2++;
		} while(num2<=30);
		
System.out.println("----------------------");
		
		int num3=70;
		// do while first execute the code
		// and only then checks de conditions
		do {
			if (num3 %2==0) {
			System.out.print(num3+" ");
			}
			num3--;
		} while(num3>=30);
	}
	}



package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println("-----------------------------------");
		int a=10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("-----------------------------------");
		int b=10;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println("-----------------------------------");
		int c=100;
		while(c>=50) {
			System.out.print(c+" ");
			c--;
		}
		System.out.println("-----------------------------------");
		int d=-1;
		while(d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		System.out.println("-----------------------------------");
		int e=1;
		while (e<=20) {
			if (e%2==0) {
				System.out.print(e+" ");
			}
			e++;
		}
		
		System.out.println("-----------------------------------");
		int f=20;
		while (f>=1) {
			if (f%2!=0) {
				System.out.print(f+" ");
			}
			f--;
		}
		
		System.out.println("-----------------------------------");
		int y=99;
		while (y>=1) {
			if (y%2!=0) {
				System.out.print(y+" ");
			}
			y--;
		}
	}

}

package com.syntax.class08;

public class TaskForOrLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=100;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		for (int i=100; i>=1;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		for (int i=20; i>=1;i--) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
						
		}
		System.out.println(" ");
		
		for (int i=20; i<=50;i++) {
			if (i%2!=1) {
				System.out.print(i+" ");
			}
						
		}
		System.out.println(" ");
	}

}

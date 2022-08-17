package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * continue-skyps current execution/iteration
		 * when java executes continue--->
		 * go bak to the beginning of the loop,
		 * so rest of the code inside loop body
		 * will be skipped/ignored
		 */
		for (int i=1;i<=5;i++) {
			if(i==4) {
				continue; // it skips or ignore and continue
			}
			System.out.println(i+" ");
		
		}
		
		// print numbers from 1 to 10 except number 5 and 7
		
		for (int i=1; i<=10;i++) {
			if(i==5 || i==7) {
				continue;
			}
			System.out.println(i+" ");
		}
	}

}

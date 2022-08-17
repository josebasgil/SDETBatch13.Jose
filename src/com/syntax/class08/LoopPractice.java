package com.syntax.class08;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// below is the same than sum 1+2+3+4+5
		int sum=0;
		for(int i=1;i<6;i++) {
			sum+=i;
			System.out.print(sum+" "); // It shows you each loop result
		}
		System.out.println(" ");
		System.out.println(sum); // It shows you final loop
	}

}

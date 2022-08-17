package com.syntax.class10;

public class ProjectEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prime=0;
		double number=10;
		for (int i=1;i<=9;i++) {
			if (number/i==1) {
				prime=0;
				break;
			} else if (number/i!=1){
				prime=1;
			}
		}
		int intnum=(int)number;
		if (prime==0) {
			System.out.println(intnum+" is a prime number");
		} else {
			System.out.println(intnum+" is not a prime number");
		}
		
		
		
	}

}

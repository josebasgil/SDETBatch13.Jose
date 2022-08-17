package com.syntax.class08;

public class Task02LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int sum2=0;
		for(int i=1;i<=70;i++) {
			if (i%2!=1) {
			sum+=i;
			} else if (i%2!=0) {
			sum2+=i;	
			}
			}
			System.out.print(sum+sum2); 
			
		System.out.println(" ");
		int secret=16;
		System.out.println("Guess my number");
		for(int k=1;k<=20;k++) { // For is better when number of iteratons is known (fixed)
			if(k!=secret) {
				System.out.println(k+" is wrong number, try again");
			} else if (k==secret) {
				System.out.println("yes "+secret+" is the correct number");
			}
			
		} 
		
		}
		
	}



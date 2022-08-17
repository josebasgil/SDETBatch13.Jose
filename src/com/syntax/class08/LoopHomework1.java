package com.syntax.class08;
import java.util.Scanner;
public class LoopHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * do {
			if (num3 %2==0) {
			System.out.print(num3+" ");
			}
			num3--;
		} while(num3>=30);
		 */
		Scanner scan=new Scanner(System.in);
		int startpoint, endpoint;
		int sumeven=0;
		int sumodd=0;
		System.out.println("Please input the starpoint");
		startpoint=scan.nextInt();
				
		do { 
			System.out.println("Please input the endpoint higher than startpoint");
			endpoint=scan.nextInt();
		} while (endpoint<=startpoint);
		
		System.out.println(" ");
		
		for (int i=startpoint; i<=endpoint; i++) {
			if (i %2==0) {
				sumeven=sumeven+i;
			} else if (i %2==1) {
				sumodd=sumodd+i;
			}
		}
		System.out.println("The sum of even numbers is "+sumeven);
		System.out.println("The sum of odd numbers is "+sumodd);
		System.out.println("The sum of even numbers and odd numbers is "+(sumeven+sumodd));
		scan.close();
	}

}

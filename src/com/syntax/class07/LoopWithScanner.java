package com.syntax.class07;
import java.util.Scanner;
public class LoopWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we are going to ask you if you got a job
		 * we will continuosly asking if you get a job untill you say yes
		 * once you say yes: Congratulations
		 */
		
	Scanner input=new Scanner(System.in);
	String job;
	
	do {
	System.out.println("Did you get a job?");
	job=input.nextLine();
	} while(!job.equalsIgnoreCase("yes"));
	System.out.println("Congratulations");
	}

}

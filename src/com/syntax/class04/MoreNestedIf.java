package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We need to check if replit was completed
		 * 
		 * if repl is completed we want to see
		 * if you did 15 and more, then "Great Job"
		 * if you did between 10 and 14, then "Good Job"
		 * before 10, then "please complete all the replit assignment"
		 */
		boolean didRepl=true;
		int assignments;
			if (didRepl) {
				System.out.println("How many assignments have you done");
				assignments=12;
				
				if(assignments>15) {
					System.out.println("you did a great job");
				} else if (assignments>10) {
					System.out.println("you did a good job");
				} else {
					System.out.println("please complete all the replit assignment");
				}
			} else {
				System.out.println("you should complet you replit homework");
			}
	}

}

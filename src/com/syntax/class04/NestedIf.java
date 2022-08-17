package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=true;
		int dose=3;
		
		if(vaccine) {
			System.out.println("Let me check how many doses you have");
			
			if(dose==1) {
				System.out.println("you need 1 more shot");
			} else if(dose==2){
				System.out.println("you have the 2 doses required");
			} else if (dose>2) {
				System.out.println("you are very vaccinated");
			}
		} else {
			System.out.println("you need to have at least 2 does");
		}
		
		String month="June";
		int day=19;
		
		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");
			if (day==8) {
				System.out.println("Today is a Mother's day");
			} else {
				System.out.println("today is any other day of May");
			}
		} else if(month.equals("June")) {
			System.out.println("Let me check what is today's date");
			if (day==19) {
				System.out.println("Today is a Father's day");
			} else {
				System.out.println("today is any other day of June");
			}
		} else {
			System.out.println("today is any other day of the year");
		}
		
	}

}

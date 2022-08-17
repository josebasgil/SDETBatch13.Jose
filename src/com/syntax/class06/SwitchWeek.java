package com.syntax.class06;

public class SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day=2;
		String name;
		
		switch (day) {
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;	
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name = "invalid";
			break;
		}
		
		System.out.println(name);
		
	}

}

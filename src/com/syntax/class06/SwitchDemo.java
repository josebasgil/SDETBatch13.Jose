package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choice='F';
		String meaning;
		// variable and matching cases must be of same type
		// switch does not allow to have duplicated cases
		switch (choice) {
		
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
			break;
		}
		System.out.println(meaning);
		
	}

}

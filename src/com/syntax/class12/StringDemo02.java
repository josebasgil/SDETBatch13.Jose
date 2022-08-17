package com.syntax.class12;

public class StringDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstname="Adem ";
		String lastname="Jones";
		String fullname=firstname+lastname;
		String fullname2=firstname.concat(lastname);
		System.out.println(fullname2);
		System.out.println(fullname);
		String name="";
		System.out.println(name.isEmpty());// Check if variable "name" is empty or not in a boolean answer
		//System.out.println(name.isBlank()); // check if variable "name" has a space or not in a boolean answer // Error because java version
		String str=" never true in propaganda ";
		System.out.println(str.trim()); // remove spaces before and after the word. Only at the begining and at the end, never in between
		
	}

}

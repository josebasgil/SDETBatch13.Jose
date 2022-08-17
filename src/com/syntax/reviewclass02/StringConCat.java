package com.syntax.reviewclass02;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstname="Ali";
		String lastname="BaBa";
		String fullname=firstname+lastname;
		int num=10;
		int num2=10;
		System.out.println(fullname);
		System.out.println(firstname+num);
		System.out.println(firstname+num+num2); // because it started in string then the rest is string
		System.out.println(firstname+(num+num2)); // in this case with string begin can be added the both int
		System.out.println(num+num2+firstname); // because it started in integer then it will add both int
		
	}

}

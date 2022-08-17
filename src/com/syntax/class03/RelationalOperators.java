package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <,>,<=,>=,==,!=
		// != means non equal
		// == compare if is equal while = asign new value
		
		int num1=20;
		int num2=22;
		System.out.println(num1>num2); // false
		System.out.println(num1<num2); // true
		System.out.println(num1!=num2); // true
		System.out.println(num1==num2); // false compare if is equal
		System.out.println(num1=num2); // Asign a new value for num1
		System.out.println(num1==num2); // false compare if is equal
		
		boolean result=100>200;
		System.out.println(result);
		
		int result1=100+200;
				
		String result2="Emre"+10;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
		int num3=10;
		int num4=11;
		
		result=num3==num4; // if num3 equals to num4
		System.out.println(result); // false
		
		result=num3!=num4; // if num3 is not equals to num4
		System.out.println(result); // true
		
		// cannot convert from boolean to integer
		
		// result=40; cannot convert, I would need to change de box type 
	}

}

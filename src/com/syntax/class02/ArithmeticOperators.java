package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		
		int sum, sub, mult, div;
		
		System.out.println(num1+num2);

		sum=num1+num2;
		sub=num2-num1;
		mult=num1*num2;
		div=num2/num1;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		double num3=9.99;
		double num4=3.50;
		
		double sum1, sub1, mult1, div1;
		sum1=num3+num4;
		sub1=num3-num4;
		mult1=num3*num4;
		div1=num3/num4;
		System.out.println(sum1);
		System.out.println(sub1);
		System.out.println(mult1);
		System.out.println(div1);
		
		int a=10;
		int b=3;
		int result=a/b;
		System.out.println(result); // show just integer part of the result because is "int"
		
		double c=10.0;
		double d= 3.0;
		double result2=c/d;
		System.out.println(result2);
		
		float e=10.0f;
		float f= 3.0f;
		float result3=e/f;
		System.out.println(result3);
				
		
	}

}

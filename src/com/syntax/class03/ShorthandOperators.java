package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		num=num+100;
		System.out.println(num); // 200
		num=num+50;
		System.out.println(num); //250
		num+=100; // A shorter way instead num=num+100
		System.out.println(num);
		num-=10; // A shorter way instead num=num-10
		System.out.println(num);
		num/=10; // A shorter way instead num=num/10
		System.out.println(num);
		num*=2; // A shorter way instead num=num*2
		System.out.println(num);
		num&=2; // A shorter way instead num=num%2
		System.out.println(num);
		
		int a, b, c;
		a=10;
		b=20;
		c=30;
		
		a+=b;
		System.out.println(a);
		a+=b+c;
		System.out.println(a);
		a*=10;
		System.out.println(a);
	}

}

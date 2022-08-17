package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ctrl+space
		// "main"+ctrl+space is an autocomplete for public class main(String[] args)...
		// "Syso"+ctrl+space is an autocomplete for system.out.println() ...
		
		int i=100;
		double d=100;
		
		System.out.println(i); // 100
		System.out.println(d); // 100.0 java asumes that there is a .000
		
		// Casting in Java: converting one type into another type
		// widening: converting a smaller datatype into a widder datatype. This is the order: byte to short to char to int to long to float to double
		// widening happens implicit, automatic
		
		long l=10000; // is an integer type of value storage in a long box. You cannot store a big number in a byte box.
		
		// narrowing: it has to be explicit casting. It happens manually 
		// double to float to long to int to short to byte
		
		// byte b=130
		// int x=100.99; type mismatch: cannot convert from double to int
		int x=(int)100.99;
		System.out.println(x); // is a technique to manually narrow a bigger value into a small box from double to int
		
		// type mismatch: cannot convert from int to byte
		byte b=(byte)130;
		System.out.println(b); // -126: is because computer try to do calculations in 0s and 1s, we dont need to understand why the result and we might not use it
		
		// front double to floate
		// float f=10.99;
		float f=10.99f; // add and f to tell java is float and not double
		double dd=9.99;
		
		
	}

}

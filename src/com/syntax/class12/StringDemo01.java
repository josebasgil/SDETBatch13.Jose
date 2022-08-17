package com.syntax.class12;

public class StringDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= new String("Oleg"); // proper way of creating an object from a classs
		String name2="Oleg"; // its same as String name = new String ("Oleg");
		// all the classes in jave can be treated as datatypes
		name.length(); // is a behavior
		// if a class is present inside the same package or if a class belongs to java.lan package
		System.out.println(name.length()); // anything inside parenthesis is a meter. if is just name.lenght we call a property
		name2="Zameer";
		System.out.println(name2.length()); // it counts how many characters are in "Zameer" it also count when there is an space "Zameer "
		String captain="NAVEED";
		System.out.println(captain.toLowerCase());
		captain=" I love Java";
		System.out.println(captain.toUpperCase());
	}

}

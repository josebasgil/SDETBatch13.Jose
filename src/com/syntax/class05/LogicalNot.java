package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean boo=!true;
		
		System.out.println(boo);
		
		boolean traffic=false;
		if(!traffic) {
			System.out.println("I will reach work on time");
		}
		
		String name="Joan";
		
		if (!name.equals("Emre")) { // If name is not Emre...
			System.out.println("You are not Emre, and I need Emre");
		}
	}

}

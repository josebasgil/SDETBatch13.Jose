package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] b=new int[4]; // the 4 means the size of the array
		// Store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		// Access values from my array
		System.out.println(b[2]); // 70
		System.out.println(b[1]+b[3]); // 185
		
		// We need to creat an array of my classmates names
		// when we create an array we must specify the size (How many elements)
		String[] classMates=new String[5];
		classMates[0]="Khrystyna";
		classMates[1]="Zameer";
		classMates[2]="Elexia";
		classMates[3]="Oleg";
		classMates[4]="Adem";
		System.out.println("My classmate name is "+classMates[3]);
		
	}

}

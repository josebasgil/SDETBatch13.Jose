package com.syntax.class10;

public class TwoDarrayShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers= {{10,20,30,40},{50,60,70,80}, {90,100,110,120}};
		
		System.out.println(numbers[1][3]);
		System.out.println(numbers[2][2]);
		
		int rows=numbers.length; // gives # of 1d array
		System.out.println("number of rows = "+rows);
		
		int columns1row=numbers[0].length;
		System.out.println("number of cols in 1 row = "+columns1row);
		
		
	}

}

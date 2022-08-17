package com.syntax.class10;

public class TwoDimensioinalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] numbers= new int [3] [4];
		// 1 row
		numbers [0][0]=10;
		numbers [0][1]=20;
		numbers [0][2]=30;
		numbers [0][3]=40;
		
		// 2 row
		numbers [1][0]=50;
		numbers [1][1]=60;
		numbers [1][2]=70;
		numbers [1][3]=80;
		
		// 3 row
		numbers [2][0]=90;
		numbers [2][1]=100;
		numbers [2][2]=110;
		numbers [2][3]=120;
		
		System.out.println(numbers[1][3]);
		System.out.println(numbers[2][2]);
		
		int rows=numbers.length; // gives # of 1d array
		System.out.println("number of rows = "+rows);
		
		int columns1row=numbers[0].length;
		System.out.println("number of cols in 1 row = "+columns1row);
	}

}

package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] price=new double[4];
		price[0]=0;
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		System.out.println(price[1]);
		
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		//numbers[3]=13; during run time error: ArrayIndexOutOfBound
		System.out.println(numbers[1]);
		// arrays are fixed in size
		// during runtime JAVA cannot increase or decrease size of an array 
	}

}

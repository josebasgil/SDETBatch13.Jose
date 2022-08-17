package com.syntax.class10;

public class TwoDarrayShort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 array: NY: all cities of NY State
		 * 2 array: CA: all cities of CA State
		 * 3 array: FL: all cities of FL State
		 * 4 array: VA: all cities of VA State
		 */
		
		String[][] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles","San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"Mclean", "Richmond", "Leesburg"}
		};
		// I want locate San Jose
		System.out.println(usa[1][2]);
		// I want locate Miami
		System.out.println(usa[2][0]);
		System.out.println("Total number of 1d arrays in array usa is "+usa.length);
		// I want t see how many elements inside each array
		int ele1array=usa[0].length;
		System.out.println("Number of elements in the first array is "+ele1array);
		int ele2array=usa[1].length;
		System.out.println("Number of elements in the second array is "+ele2array);
		int ele3array=usa[2].length;
		System.out.println("Number of elements in the third array is "+ele3array);
		int ele4array=usa[3].length;
		System.out.println("Number of elements in the fourth array is "+ele4array);
	}

}

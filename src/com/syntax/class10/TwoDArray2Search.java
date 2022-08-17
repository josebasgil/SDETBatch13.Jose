package com.syntax.class10;

public class TwoDArray2Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] usa= {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles","San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"Mclean", "Richmond", "Leesburg"}
		};
		// outer loop iterates over rows
		for (int row=0; row<usa.length;row++) {
			for(int col=0;col<usa[row].length;col++) {
				System.out.print(usa[row][col]+" ");
			} System.out.println(" ");
		}
		
	}

}

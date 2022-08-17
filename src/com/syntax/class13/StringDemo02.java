package com.syntax.class13;

public class StringDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		System.out.println(str.replaceAll("[A-Z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "_"));
		String str2="SDs#$((i87S9nD8t$((aG79#$((S8x79GD!@#$((%^^";
		System.out.println(str2.replaceAll("[^a-z]", "_"));
		System.out.println(str2.replaceAll("[^a-z]", "")); // when "" empty, remove all special characters
	}

}

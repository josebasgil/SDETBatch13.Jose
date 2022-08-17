package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Batch 13 is great but I say this to every batch. I was kidding";
		System.out.println(str.length());
		int len=str.length();
		System.out.println(len);
		System.out.println(str.toUpperCase()); // This print str in upper case but doesn't change it
		str=str.toUpperCase(); // This change str to upper case from its origin
		System.out.println(str);
		str="";
		System.out.println(str.isEmpty()); // Tell me if str is empty of content
		String str2="   Tara               ";
		System.out.println(str2.trim());
		str="Batch 13 is great but I say this to every batch. I was kidding";
		System.out.println(str.contains("z"));
		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("ing"));
	}

}

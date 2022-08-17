package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am #Confused#";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='#') {
					System.out.print(str.substring(i+1,str.length()-1));
					break;
			}
			
			
	}

	}
}
package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that reads two people's names and if they expecting boy or girl?
		/*
		 * Based on the input suggests a name for a baby:
		 * example output:
		 * Mom's first name? Mary
		 * Dad's first name? Daniel
		 * Boy or girl? Boy
		 * Suggested name for baby: Danry
		 * 
		 * Example output:
		 * Mom's first name? Mary
		 * Dad's first name? Daniel
		 * Boy or girl? Boy
		 * Suggested name for baby: Maiel
		 */
		String father="Sameer";
		String mother="Taylor Swift";
		boolean boy=true; // If true boy otherwise girls
		boolean girl=true;
		
		if(boy) {
			String firsthalf=father.substring(0,father.length()/2);
			System.out.println(firsthalf);
			String secondhalf=mother.substring(mother.length()/2);
			System.out.println(secondhalf);
			System.out.println(firsthalf.concat(secondhalf.trim()));
		}
		if(girl) {
			String firsthalf=mother.substring(0,mother.length()/2);
			System.out.println(firsthalf);
			String secondhalf=father.substring(father.length()/2);
			System.out.println(secondhalf);
			System.out.println(firsthalf.concat(secondhalf.trim()));
		}
	}

}

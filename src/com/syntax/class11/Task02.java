package com.syntax.class11;
import java.util.Scanner;
public class Task02 {
// Pendiente resolver
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Scanner create an array of countries.
		// when an array is create, retrieve all values from it
		// and while retrieving those values print the capital of each country
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int arraySize=scan.nextInt();
		String[] countryArray=new String[arraySize];
		System.out.println("Please enter each of the "+arraySize+" capital");
		for (int i=0;i<countryArray.length;i++) {
			countryArray[i]=scan.next(); 
		}
		String capital=null;
		for (String element:countryArray) {
			switch(element.toLowerCase()) { 
			case "mexico":
				capital= "mexico df";
				break;
			case "peru":
				capital= "lima";
				break;
			case "spain":
				capital= "madrid";
				break;
			case "turkey":
				capital= "ankara";
				break;
			case "pakistan":
				capital= "islamabad";
				break;
			case "egypt":
				capital= "cairo";
				break;
			case "usa":
				capital= "washington dc";
				break;
			default:
				capital="Unknown";
				break;	
			} 
			System.out.println("For "+element+" the capital is "+capital);
	}
	}
}

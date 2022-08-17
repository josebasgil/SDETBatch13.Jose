package com.syntax.class06;

import java.util.Scanner;

public class HWClass06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("EX1:");
		String country, language;
		
		System.out.println("Please, tell me where are you from?");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "peru":
			language= "Spanish";
			break;
		case "brasil":
			language= "Portuguese";
			break;
		case "united states":
			language= "English";
			break;
		case "turkey":
			language= "Turquish";
			break;
		case "france":
			language= "French";
			break;
		case "germany":
			language= "German";
			break;
		case "china":
			language= "Chinese";
			break;
		default:
			language="Unknown";
			break;	
		
		}
		
		System.out.println("Your native language is "+language);
		
		System.out.println("------------------------------");
		System.out.println("EX2:");
		char grade;
		String explanation;
		
		
		System.out.println("Please, tell me which was your grade?");
		grade=input.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			explanation= "Exellent";
			break;
		case 'B':
			explanation= "Good";
			break;
		case 'C':
			explanation= "Average";
			break;
		case 'D':
			explanation= "Bad";
			break;
		case 'E':
			explanation= "Not Acceptable";
			break;
		case 'F':
			explanation= "Not Acceptable";
			break;
		default:
			explanation="Unknown";
			break;	
		
		}
		
		System.out.println("Your grade means "+explanation);
		
		System.out.println("------------------------------");
		System.out.println("EX3:");
		
		int num1, num2, result;
		String calc;
		
		System.out.println("Enter first number");
		num1=input.nextInt();
		System.out.println("Enter symbol: + - * /");
		calc=input.next();
		System.out.println("Enter second number");
		num2=input.nextInt();
		
		switch(calc) {
		
		case "+":
			result= num1+num2;
			break;
		case "-":
			result= num1-num2;
			break;
		case "*":
			result= num1*num2;
			break;
		case "/":
			result= num1/num2;
			break;
		default:
			result=0;
			break;	
		
		}
		
		System.out.println("The result is "+result);
		
		System.out.println("------------------------------");
		System.out.println("EX4:");
		
		String product, saledecision, discountst;
		int price, qty, totalvalue;
		double totalvalued, discount, valuediscount;
		discountst=" ";
		
		System.out.println("Do you want to buy in the store?");
		saledecision=input.next();
		
		if (saledecision.equalsIgnoreCase("yes")) {
		
			System.out.println("Please select the product you want to buy (shoes, shirt, pants, jacket)");
			product=input.next();
			
			switch(product.toLowerCase()) {
			
			case "shoes":
				price= 60;
				break;
			case "shirt":
				price= 20;
				break;
			case "pants":
				price= 40;
				break;
			case "jacket":
				price= 80;
				break;
			default:
				price=0;
				break;	
			}
			
			System.out.println("Please enter the quantity of items");
			qty=input.nextInt();
			totalvalue=price*qty;
			
			if (totalvalue<20) {
				discount=0.10;
				discountst="10%";
			} else if (totalvalue>=20 && totalvalue<100) {
				discount=0.2;
				discountst="20%";
			} else if (totalvalue>=100 && totalvalue<500) {
				discount=0.3;
				discountst="30%";
			} else if (totalvalue>=500) {
				discount=0.5;
				discountst="50%";
			} else {
				discount=0;
			}
			
			totalvalued=Double.valueOf(totalvalue);
			valuediscount=totalvalued-discount*totalvalued;
			
			System.out.println("After discount of "+discountst+" the price of the purchase is reduced from "+totalvalued+" to "+valuediscount);
			
		} else if (saledecision.equalsIgnoreCase("no")) {
			System.out.println("You are not going for shopping");
		} else {
			System.out.println("Wrong input");
		}
		
	}

}

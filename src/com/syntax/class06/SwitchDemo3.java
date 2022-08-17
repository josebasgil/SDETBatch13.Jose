package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Let's ask a user where is he from
		 * based on the country we will define favorite food
		 */
		Scanner input=new Scanner(System.in);
		
		String country, Food;
		
		System.out.println("Please, tell me where are you from?");
		country=input.nextLine();
		
		switch(country.toLowerCase()) { // to put all words in lowercase
		case "mexico":
			Food= "tacos";
			break;
		case "peru":
			Food= "ceviche";
			break;
		case "spain":
			Food= "paella";
			break;
		case "turkey":
			Food= "lahmacun";
			break;
		case "pakistan":
			Food= "pati chai";
			break;
		case "egipt":
			Food= "Koshary";
			break;
		case "usa":
			Food= "Burger";
			break;
		default:
			Food="Unknown";
			break;	
		
		} 
		
		System.out.println("You are from "+country+" so you might like "+Food);
		
	}

}

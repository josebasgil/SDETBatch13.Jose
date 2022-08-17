package com.syntax.class08;
import java.util.Scanner;
public class LoopHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int payment=0;
		int totalpayment=0;
		System.out.println("Please enter the product (Shoes, Pants, Jacket):");
		String product =scan.next();
		System.out.println("Please enter the price of the product");
		int price=scan.nextInt();
		
		do { 
			System.out.println("Please insert your payment");
			payment=scan.nextInt();
			totalpayment+=payment; 
			System.out.println("Your total payment is "+totalpayment);
			if ((price-totalpayment)<0) {
				System.out.println(" ");
			} else {
				System.out.println("Left to pay = "+(price-totalpayment));
			}
		} while (totalpayment<price);
		
		if (totalpayment>price) {
			System.out.println("Thank you for your payment!!! , your change is "+(totalpayment-price));
		} else {
			System.out.println("Thank you for your payment !!!");
		}
		
		
		
		
		
	}

}

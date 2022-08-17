package com.syntax.class11;
import java.util.Scanner;
import java.util.Arrays;
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using scanner create an array of integer values. after the array is created
		// calculate the sum of all stored elements in that array
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=scan.nextInt();
		
		System.out.println("the size of the array is "+arraySize);
		int [] integerArray=new int[arraySize]; // creating an array of size that will be entered by user
		// we cant use enhanced for loop for inserting or updating the values of an array
		System.out.println("Please enter "+arraySize+" elements");
		for (int i=0; i<integerArray.length;i++) {
			integerArray[i]=scan.nextInt(); // taking the nput from the user and storing it inside the array
		}
		System.out.println("The array is "+Arrays.toString(integerArray));
		int sum=0;
		for (int element:integerArray) { // advance for loop
			sum=sum+element; // take the element from the array one by one and add them to the sum variable
		}
		System.out.println("the sum of all elements is "+sum);
		
	}

}

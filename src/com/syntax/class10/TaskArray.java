package com.syntax.class10;

public class TaskArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// From an array of integer elements find the largest number 
		int[] numbers= {10, 222, 3, 884, 5};
		int largest=numbers[0];
		for (int i=1;i<numbers.length;i++) {
			if (numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		System.out.println("the largest element is "+largest);
		// this new method of for loop is for arrays and is more simple
		System.out.println(" ");
		int max = numbers[0];
		for (int num:numbers) {
			if (num>max) {
				max=num;
			}
		}
		System.out.println("the largest element is "+max);
		
		// Create an array to store char values then print in reverse order
		System.out.println(" ");
		char[] values= {'a', 'n', 'n', 'a'};
		for (int i= values.length-1;i>=0;i--) {
			System.out.print(values[i]+" ");
		}
	}

}

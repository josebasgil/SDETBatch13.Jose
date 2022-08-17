package com.syntax.class10;

public class LastClassHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create an array to store double values and then print all elements using different loops
		 */
		
		double[] num= {2.99, 3.99, 4.99, 5};
		
		for (double x:num) {
			System.out.print(x+" ");
		}
		System.out.println(" ");
		for (int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		/*
		 * Create an array of integers
		 * calculate the sum of all elements in the array
		 */
		System.out.println(" ");
		int[] numbers= {10, 222, 3, 4, 5};
		int sum=0;
		int sum2=0;
		for (int i=0; i<numbers.length;i++) {
			sum+=numbers[i]; // is equal to sum=sum+numbers[i];
		}
		System.out.println("The sum of all elements is "+sum);
		System.out.println("");
		for(int n:numbers) {
			sum2+=n; // is equal to sum2=sum2+n;
		}
		System.out.println("The sum of all elements is "+sum2);
	}

}

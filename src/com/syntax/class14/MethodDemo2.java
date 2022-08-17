package com.syntax.class14;

public class MethodDemo2 {
	// Write a method when called it shoyld print 5 times batch 13 is great
	
	void syntax() {
		for (int i=0;i<5;i++) {
			System.out.println("Batch 13 is Great");	
		}		
	}
	
	void printTimes(int times) {
		for (int i=0;i<times;i++) {
			System.out.println("Tara is Great");	
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 md=new MethodDemo2();
		md.syntax();
		md.printTimes(3);
	}

}

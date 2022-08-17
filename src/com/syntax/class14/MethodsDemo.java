package com.syntax.class14;
import java.util.Scanner;
public class MethodsDemo {

	// Method is a block of code a group of java statements that are grouped together and 
	// we can execute those statementes buy just creating and object of the class that contains
	// that method and by writing the objects name.method name
	
	void printHello() {
		System.out.println("How are you guys");
	}
	
	boolean returnTrue() {
		return true;
	}
	int returnInt () {
		return 10;
	}
	// Methods that return something and methods that don't return something
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo md=new MethodsDemo();
		md.printHello();
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(md.returnInt());
		Scanner scan=new Scanner (System.in);
		int x=scan.nextInt();
	}

}

package com.syntax.class11;
import java.util.Scanner;
public class Dog {

	
		// TODO Auto-generated method stub
		// attributes ow the object will look like
		String name;
		int age;
		double weight;
		String color;
		double height;
		String breed;
		// how the object behave
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		}
		void eat() {
			System.out.println("Dogs like to eat bone");
		}
	
		public static void main(String[] args) {
			// Scanner scan=new Scanner (System.in); // ctrl+click on windows cmd+click on mack
			// scan.next();
			Dog jimmy= new Dog();
			// new Dog() is how we create an object
			// Attributes
			jimmy.name="Jimmy";
			jimmy.age=6;
			jimmy.weight=16;
			jimmy.color="Black";
			jimmy.height=2.6;
			jimmy.breed="German";
			// Behavior
			jimmy.bark();
			
		}

}

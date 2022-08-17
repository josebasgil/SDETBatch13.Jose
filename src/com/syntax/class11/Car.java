package com.syntax.class11;

public class Car {

	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int HP;
	
	void MoveForward() {
		System.out.println("Car is moving forward");
	}
	
	void reverse() {
		System.out.println("Moving backwards");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car bmw=new Car();
		bmw.model="x6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.NoOfDoors=5;
		bmw.HP=500;
		bmw.MoveForward();
		bmw.reverse();
		System.out.println(bmw.color);
	}

}

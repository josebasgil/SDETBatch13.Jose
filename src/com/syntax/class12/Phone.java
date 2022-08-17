package com.syntax.class12;

public class Phone {

	// Phone
	
	String model;
	String maker;
	double screenSize;
	int RAM;
	int ROM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("Calling someone");
	}
	
	void takePicture () {
		System.out.println("use my camera app to take pictures");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone s22Ultra = new Phone ();
		s22Ultra.maker = "Samsung";
		s22Ultra.model = "Samsung Galaxy S22 Ultra";
		s22Ultra.screenSize = 6.8;
		s22Ultra.RAM=12;
		s22Ultra.camera=108;
		s22Ultra.storage=512;
		System.out.println(s22Ultra.storage);
		s22Ultra.call();
		
	}

}

package com.syntax.class02;

public class HomeworkMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3;
		num1=2.50;
		num2=4.30;
		
		double sum = num1+num2;
		double sub = num2-num1;
		double mult = num1*num2;
		double div = num2/num1;
		
		System.out.println("The sum of 2 numbers, "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The substraction of 2 numbers, "+num2+" minus "+num1+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers, "+num1+" times "+num2+" is equal to "+mult);
		System.out.println("The division of 2 numbers, "+num2+" divided "+num1+" is equal to "+div);
		
		num3= 3.90;
		
		double square=num3*num3;
		
		System.out.println("The square of the "+num3+" is "+square);
		
		int width, height, perimeter, area;
		
		width=5;
		height=8;
		perimeter=width*2+height*2;
		area=width*height;
		
		System.out.println("the perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
		

		
	}

}

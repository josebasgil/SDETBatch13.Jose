package com.syntax.class10;

public class ArrayReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Mc Pato"};
		int size=disney.length;
		System.out.println(size);
		System.out.println(disney[1]);
		// System.out.println(disney[4]); Array index out of bounds exception
		
		String[] iceCream=new String[3];
		iceCream[0]="Butter pecan";
		iceCream[1]="Chocolate;";
		
		System.out.println(iceCream[2]); // the ouput is null because ths storage [2] is empty
		System.out.println(" ");
		for(int i=0; i<disney.length; i++) {
			
		
			if(disney[i].equalsIgnoreCase("Shrek")) {
				System.out.println(disney[i]+" is my favorite character");
			} else {
				System.out.println(disney[i]);
			}
		}
		
		System.out.println(" ");
		System.out.println("All elements using regular for loop -------");
		
		for(String character:disney) {
			if(character.equalsIgnoreCase("Mulan")) {
				System.out.println(character+" is my favorite character");
				
			} else {
				System.out.println(character+" ");
			}
			
			
					
			
		}
		
		
		
	}

}

package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=3;i++) {
			System.out.println("Hello"); // his prints repeats 3 times because is inside the loop
			for (int y=1;y<=2;y++) { // Nested loop
				System.out.println("bye"); // its prints repeats 6 times because is inside the 3 loop, so repeats 2 for inner loop and times 3 for outer loop
			}
		}
		System.out.println(" ");
		for (int i=1; i<=3;i++) {
			System.out.println("Wanna party?"); // his prints repeats 3 times because is inside the loop
			for (int y=1;y<=2;y++) { // Nested loop
				System.out.println("Party!!"); // its prints repeats 6 times because is inside the 3 loop, so repeats 2 for inner loop and times 3 for outer loop
			}
		}
		System.out.println(" ");
		for (int i=1; i<=3;i++) {
			for (int y=1;y<=2;y++) { 
				System.out.println(i+" "+y);
			}
		}
		System.out.println(" ");
		for (int i=1; i<=3;i++) {
			System.out.println("Hello"); // inner loop "false" so it show only be outer loop result
			for (int y=1;y>=2;y++) { 
				System.out.println("bye"); 
			}
		}
		System.out.println(" ");
		for (int i=1; i>3;i--) { // there wont be any result because outer loop "false" and control inner loop
			System.out.println("Hello"); 
			for (int y=1;y>=2;y++) { 
				System.out.println("bye"); 
			}
		}
	}

}

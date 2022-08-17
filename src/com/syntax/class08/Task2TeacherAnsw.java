package com.syntax.class08;
import java.util.Scanner;
public class Task2TeacherAnsw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int secretNum=25;
		int guessedNum;
		
		Scanner scan=new Scanner(System.in);
		
		do { // there is not limitation of iterations, is just a comparison between 2 numbers
			System.out.println("Guess my secret number");
			guessedNum=scan.nextInt();
		} while (guessedNum!=secretNum);
		
		System.out.println("You got it");
		
	}

}

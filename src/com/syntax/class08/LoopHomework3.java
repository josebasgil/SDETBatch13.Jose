package com.syntax.class08;

public class LoopHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a=0; a<=2;a++) {
			for (int b=0;b<=9;b++) {
				if (a==2 && b==4){
					break;
				} else {
				for (int c=0;c<6;c++) {
					for (int d=1;d<=9;d++) {
						System.out.println(a+" "+b+" : "+c+" "+d);
					}
				}
				}
			}
		}
		
	}

}

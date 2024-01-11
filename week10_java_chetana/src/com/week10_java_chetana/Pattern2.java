package com.week10_java_chetana;

public class Pattern2 {
	public static void main(String[] args) {

		
		for (int index = 1; index <= 5; index++) {
			for (int index1 = 1; index1<=5; index1++) {
				if ( index1 == 1 || index1 == 5||index == 1 || index == 5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
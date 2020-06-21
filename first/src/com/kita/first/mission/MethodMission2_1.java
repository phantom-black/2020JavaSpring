package com.kita.first.mission;

public class MethodMission2_1 {
	public static void main(String[] args) {
		// printStar(6);
		// ******
		// printStar(3);
		// ***
		// printStarSquare(4);
		// ****
		// ****
		// ****
		// ****
		// printStarTriangle(5);
		printStarTriangleReverse(5);
	}
	
	public static void printStar(int star) {
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printStarSquare(int star) {
		for(int i=0; i<star; i++) {
			printStar(star);
			System.out.println();
		}
	}
	
	public static void printStarTriangle(int star) {
		for(int i=1; i<=star; i++) {
			printStar(i);
			System.out.println();
		}
	}
	
	/*
	public static void printStarTriangleReverse(int star) {
		for(int i=1; i<=star; i++) {
			for(int z=star-i; z>0; z--) {
				System.out.print(" ");
			}
			printStar(i);
			System.out.println();
		}
	}
	*/
	
	
	public static void printStarTriangleReverse(int star) {
		for(int i=star-1; i>=0; i--) {
			printChar(' ', i);
			printStar(star-i);
		}
	}
	
	public static void printChar(char ch, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
	}
}

package com.kita.first.mission;

public class Mission6_7 {
	public static void main(String[] args) {
		int star = 5;
		
		for(int i=1; i<=star; i++) {
			
			for(int z=star; z>0; z--) {
				System.out.print(i<z ? " " : "*");	// (i<z ? " " : " *") 하면 피라미드 모양
				/*
				if(i<z) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
				*/
			}
			System.out.println();

		}
	}
}

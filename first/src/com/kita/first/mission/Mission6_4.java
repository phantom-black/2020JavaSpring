package com.kita.first.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %d\t", dan, i, (dan*i));
			}
			System.out.println();
		}
	}
}

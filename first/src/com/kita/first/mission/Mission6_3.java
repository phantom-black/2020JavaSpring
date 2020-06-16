package com.kita.first.mission;

public class Mission6_3 {
	/*
	 	2~9단
	 	
	 	단!! 단이 바뀔 때 개행을 한 번 더
	 */
	
	public static void main(String[] args) {
		
		for(int dan=2;dan<10;dan++) {
			
			for(int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			}
			
			System.out.println("---------------");
			
		}
	}
}

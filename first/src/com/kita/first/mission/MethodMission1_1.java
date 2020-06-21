package com.kita.first.mission;

public class MethodMission1_1 {
	public static void main(String[] args) {
		guguDan(5);
		guguDan(2);
		
		guguDan(4, 7);
	}
	
	public static void guguDan(int n) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, (n*i));
		}
		System.out.println();
	}
	
	public static void guguDan(int min, int max) {
		for(int i=min; i<=max; i++) {
			guguDan(i);
		}
	}
}

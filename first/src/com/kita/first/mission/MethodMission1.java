package com.kita.first.mission;

public class MethodMission1 {
	public static void main(String[] args) {
		guguDan(5);
		guguDan(2);
		
		guguDan(4, 7);
	}
	
	public static void guguDan(int sDan, int eDan) {
		for(int z=sDan; z<=eDan; z++) {
			guguDan(z);
		}
	}
	
	public static void guguDan(int dan) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
		System.out.println();
	}
}

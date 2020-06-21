package com.kita.first.mission;

public class MethodMission3_1 {
	public static void main(String[] args) {
		int result = abs(10);
		System.out.println(result);
		
		result = abs(-10);
		System.out.println(result);
	}
	
	
	public static int abs(int i) {
		/*
		if(i<0) {
			return -i;
		}
		return i;
		*/
		
		// 이 부분 다시 복습
		return (i<0) ? -i : i;
	}
}

package com.kita.first.level2;

public class NormalVsRef {
	public static void main(String[] args) {
		int num = 10;	// 일반변수 -> 리터럴값
		System.out.println("before num: " + num);
		changeVal(num);
		System.out.println("after num: " + num);
		
		int[] numArr = {10};	// 배열 : 레퍼런스 변수 -> 주소값 지정
		System.out.println("before numArr[0]: " + numArr[0]);
		changeVal(numArr);
		System.out.println("after numArr[0]: " + numArr[0]);
		
	}
	
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
	
	public static void changeVal(int num) {
		num = 30;
	}
}

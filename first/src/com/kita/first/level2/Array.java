package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[4];	// 대괄호 -> 배열 -> 레퍼런스 변수, new -> 객체화시킬 때 쓰는 키워드 -> 레퍼런스 변수
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		char[] arr2 = new char[20];	// char 변수 20개의 메모리 할당
		System.out.printf("char: %c, %d\n", arr2[2], (int)arr2[2]);
		
		float[] arr3 = new float[10]; // 일반변수타입[] 배열이름 = new 일반변수타입(앞과 동일)[메모리 할당할 변수의 개수];
		String[] arr4 = new String[200]; // 레퍼런스 타입도 가능
										// 레퍼런스 변수에 한 번도 값 안 넣었다면 null : 주소값이 없다는 의미
										// 일반 변수에는 초기값 없다면 디폴트 값 들어감
										// - 숫자 변수(byte~double)에 값 안 넣었다면 0
										// - boolean에 값 안 넣었다면 false
										// - char에 값 안 넣었다면 빈 칸(blank), 숫가값은 0
		arr4[0] = "dd";
		
		int[] arr5 = {10, 20, 30, 40};	// 배열이름 : 오른쪽의 배열에 접근할 때 쓰는 주소값
		int[] arr6 = arr5;
		
		System.out.println(arr5);
		System.out.println(arr6);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//------------------------------------------
		
		int[] arr7 = new int[50];
		
		// arr7 = null; <- 배열 안 값 날림
		
		for(int i=0; i<arr7.length; i++) {	// 배열이름.length -> 배열 안 변수의 개수
			arr7[i]=5;
		}
		
		for(int i=0; i<arr7.length; i++) {	// 레퍼런스 변수일 때만 . 사용 가능((주소값).) 
											// <- 레퍼런스 변수 안에 null 혹은 주소값 들어감, null일 때는 절대 . 쓰면 안됨(Runtime Error)
			System.out.println(i + ": " + arr7[i]);
		}
		
		// 배열에 집어넣기와 배열값 출력을 분리시키기, 한 가지 일만 할 수 있게 해야 재사용성 높아지기 때문
		// 메소드-> 한 번에 한 가지 일만 할 수 있게 해야 재사용성 높아진다
		
		// length, out 등 -> 상수라도 대문자 아닐 수 있음 but 상수는 무조건 대문자로 만들기
	}
}

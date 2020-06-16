package com.kita.first;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = "안녕1";
		String str2 = "안녕2";	// str1과 str2는 주소값 다르므로 다른 객체
		String str3 = str2;	// str2와 주소값 같음, 변수는 3개지만 실제로 객체는 2개
		
		System.out.println(str1 == str2);	// 사용x
											// ==, !=는 주소값 비교 (주소값 같아야 true), 크고 작음은 비교x
		System.out.println(str2.equals(str1)); // 문자열 비교 -> equals() 메소드를 통해서만 값 비교
		System.out.println("안녕1".equals(str1));	// 변수가 뒤로 가는 게 안정적, 에러가 덜 난다
		System.out.println("안녕4".equals("안녕5"));
		System.out.println(str2.contentEquals("안녕6"));
	}
}

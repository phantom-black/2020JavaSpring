package com.kita.first;

public class Operator5 {
	public static void main(String[] args) {
		// 비교연산자 > boolean
		int n1 = 10;	// 피연산자는 2개여야, 3개 이상 비교 안됨
		int n2 = 11;
		boolean result = (n1 == n2);	// !result는 값이 반대, !!result는 반대의 반대
		System.out.println(result);
		System.out.println(n1 == n2);	//  비교연산자 ==, 대입연산자 =
		System.out.println(n1);
		
		System.out.println();
		result = (n1 != n2);
		System.out.println(result);
		System.out.println(n1 != n2);
		
		System.out.println();
		result = n1 > n2;
		System.out.println("n1 > n2 : " + result);
		result = n2 > n1;
		System.out.println("n2 < n1 : " + result);
		
		// 문자열은 == 비교 안됨
	}
}

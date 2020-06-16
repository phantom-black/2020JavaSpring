package com.kita.first;

public class Operator3 {
	public static void main(String[] args) {
		int n1 = 10;
		int cost = 3;	// 리터럴값 지양하기
		n1 = n1 + cost;
		System.out.println("n1 : " + n1);
		
		int n2 = 10;
		n2 = n2 + 2;
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3 += (-2);	// 가독성 위해 괄호 사용 -> 부호연산자인지 사칙연산자인지
		System.out.println("n3 : " + n3);
	}
}

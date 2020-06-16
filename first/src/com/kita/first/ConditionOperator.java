package com.kita.first;

public class ConditionOperator {
	public static void main(String[] args) {
		// 삼항식, 조건연산자 -->  A ? B : C
		int num = 3; 
		
		// boolean isOdd = (num % 2 == 1 ? true : false);
		// System.out.printf("%d is odd? %b\n", num, isOdd);
		
		String result = ( num % 2 == 1 ? "홀수" : "짝수");
		
		System.out.printf("%d is %s\n", num, result);
		
	}
}

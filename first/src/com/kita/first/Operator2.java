package com.kita.first;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		
		int result = n1++;	// ++하지 않은 값 넘긴 후에 ++
		System.out.println("result: " + result);
		System.out.println("n1: " + n1);
		
		int result2 = ++n2;	// ++한 값 넘김
		System.out.println("result2: " + result2);
		System.out.println("n2: " + n2);
	}
}

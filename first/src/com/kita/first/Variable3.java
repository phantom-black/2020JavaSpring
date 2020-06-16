package com.kita.first;

public class Variable3 {
	public static void main(String[] args) {
		int n1 = 2_147_483_647;
		long n4 = 22222;
		float n2 = 50.2f; 

		int result = (int)n2 + n1;	// float + int = float
		double n3 = n2;
		
		System.out.println(n1);
		System.out.println(n2);
	}
}

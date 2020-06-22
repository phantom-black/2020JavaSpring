package com.kita.first.level3;

public class Calc {
	static int n1;
	static int n2;
	
	/*
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	*/
	
	public int sum() {

		return n1+n2;
	}
	
	public static int sum(int n1, int n2) {
		return Calc.n1 + n2;
	}
}

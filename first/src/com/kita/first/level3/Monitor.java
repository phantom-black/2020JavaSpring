package com.kita.first.level3;

public class Monitor {	// 클래스변수
	static String brand;	// static 붙으면 완전 별개, 무조건 값이 하나만 저장됨(공용)
	int inch;	// 인스턴스 변수
				// static은 프로그램 시작 시 메모리에 들어가 있음
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n", this.brand, inch);	// this 붙여도 안 붙여도 상관없다
	}
	
	void printInch() {
		System.out.println(brand);
		System.out.println(inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
}

package com.kita.first;

public class Variable {
	public static void main(String[] args) {
		// 일반변수 8개
		char v1;	// 문자형,정수형 변수
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
		
		v1 = 'B';
		System.out.println(v1);
		
		byte v2;	// 정수형 1바이트
		short v3;	// 정수형 2바이트
		int v4;		// 정수형 4바이트=32비트 보통 이거 씀 속도 제일 빠르기 때문
		long v5;	// 정수형 8바이트 혹시나 인트보다 큰 값 저장 시 사용
		
		v2 = 10;	// v2 = (byte)128; <- 강제형변환, 오버플로우 돼서 한 바퀴 돎 : -128, 129는 - 127
		v3 = 540;	// 자동형변환 <-> 강제형변환
		v4 = 30;
		v5 = 50;
		// 변수 두 개가 만나면 무조건 타입이 같아져야
		
		v2 = (byte)v3;
		
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6;	// 실수형(정확하진x, 정확에 근접, 소수점 아래는 지수법에 의해 저장) 4바이트
		v6 = (float)10.1;	// 실수는 기본타입 double이라 빨간줄 뜸, 강제형변환 or 타입 변환
		v6 = 10.1f; // f:대소문자 상관 x, 타입을 float으로 바꿔줌
		v6 = 10.1F;
		
		double v7;	// 실수형 8바이트(더 정확, 더 느림)
		v7 = 10.1;
		
		v6= (float)v7;	// 에러 없게 하려면 강제형변환, 오버(언더)플로우 발생 가능성 ㅇ
		
		boolean v8;  // true or false
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		
		String r1 = "안녕하세요.";	// 변수타입 대문자로 시작->100% 레퍼런스 변수
		System.out.println(r1);
		Variable r2;	// 위의 class Variable과 동일한 변수
	}
}

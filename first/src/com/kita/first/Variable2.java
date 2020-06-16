package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;
		
		// 네이밍 주의사항!
		// 1. 소문자 시작!! (가능한 한 카멜 케이스 기법 사용) ex) int myMaxHeight
		// 2. 특수기호는 _, %만 사용 가능 - 특수기호로 시작해도 무방!
		// 3. 숫자로 시작 No!!, 뒤에 붙이는 건 OK ex) int 12a; (x) int top10; (ㅇ)
		// 4. 예약어(보라색 -public, static, int 등) 사용 금지! ex)int char;
		// 5. 변수명 띄어쓰기 포함 금지 ex) int aa aa; 
		// 6. 대소문자 구분됨 ex) int aa, aA, Aa, AA;
		
		final int MY_MAX_HEIGHT = 1_000_000; // _는 없는 것과 동일, 수의 자리 표시에 사용
		System.out.println(MY_MAX_HEIGHT); 
		
		final int HEIGHT;
		HEIGHT = 100;
		
		// 7. 상수명은 무조건 대문자, 구분은 _로 한다.
		
		
	}
}

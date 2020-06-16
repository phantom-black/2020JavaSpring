package com.kita.first;

public class Operator7 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println(n1 == n2 && n1 == n3 && n2 == n3); 	
		// &&: and 연산자, true 나오기가 어렵다, 하나라도 false면 false 나옴
		
		System.out.println(n1 == n2 || n1 == n3 || n2 == n3); 	
		// ||: or 연산자, false 나오기가 어렵다, 하나라도 true면 true 나옴
		
		// &나 | 하나를 쓰면 값 정해졌어도 뒤쪽까지 전부 연산하므로 사용하지 않는다
		// &&는 false, ||는 true 나올 확률 높은 걸 앞쪽으로, + > * > / -> 퍼포먼스 올릴 수 있음
		
	}
}

package com.kita.first;

public class If {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		if(n1 > n2) {	// if() <- 괄호 안에는 boolean값만 들어갈 수 있다
			System.out.println("n1이 n2보다 크다!!");
			
		} else if(n1 == n2) {
			System.out.println("n1과 n2이 같다!!");
			
		} else {
			System.out.println("n1이 n2보다 크지 않다!!");
		}
		// if와 else는 그룹, 제일 빨리 만나는 하나의 참만 실행됨
		// 3가지 다 따로 하려면 if 3개로 적어야
		// if문 안에 if문 넣을 수 있음
		
		System.out.println("끝!!");
	}
}

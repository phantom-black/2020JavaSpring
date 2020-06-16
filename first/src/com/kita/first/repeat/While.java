package com.kita.first.repeat;

public class While {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {	// 몇 번 돌 지 알 때   like 구구단
			System.out.println(i);
		}
		System.out.println("-----------");
		
		int i=0;
		while(i<5) {	// 어떤 조건인 동안 돌아갈 때
			System.out.println(i);
			i++;
		}
	}
}

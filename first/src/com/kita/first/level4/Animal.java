package com.kita.first.level4;

public class Animal extends Object { // extends Object는 생략해도 자동으로 들어감
									// 모든 객체는 Object부터 만들어진 후 자식으로 만들어짐
	private String name;
	private String type; // 포유류, 조류, 어류
	
	protected Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	void crying() {
		System.out.println("울다~~");
	}
	
	void eat() {
		System.out.println("먹다~~");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s입니다.\n", name);
	}
}

package com.kita.first.level3;

public class Car extends Object {	// extends Object 안 넣어도 자동으로 들어감
	String name;
	String color;
	int cc;

	// 생성자 이름 클래스명과 같다(자바만), 리턴 타입 없다	
	public Car() { // <- 컴파일러가 기본적으로 넣어주는 모습
		// super(); // 내 직속 부모의 주소값 -> 생략 가능
		this("소나타", "흰색", 2500);
	}
	/*
	public Car(String name, String color, int cc) {
		super();	// 소괄호 : 생성자 호출  ==> 내 부모의 생성자 호출
		this.name = name;	// this : 나의 객체 주소값
							// 주소값.name과 같다 ==> car.name = "아반떼"; 와 같은 효과
		this.color = color;
		this.cc = cc;
	}
	*/

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", name, color, cc);
	}
	
	public Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
}

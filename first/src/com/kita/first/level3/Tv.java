package com.kita.first.level3;

// 사용자 정의 클래스 <- (이름) : 타입이 될 수도 객체가 될 수도 있음
public class Tv {
	String name;	// 레퍼런스 변수 기본값 : null
	boolean power;	// boolean 기본값 : false
	int channel;	// 숫자변수 기본값 : 0
	
	void changePower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

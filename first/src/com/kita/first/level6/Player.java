package com.kita.first.level6;

public abstract class Player { // 추상메소드 하나라도 있으면 무조건 클래스 앞에도, 그 메소드 앞에도 abstract 붙여줘야 함
								// 추상메소드 없이 abstract를 클래스 앞에 붙을 때 : 객체화하기 싫다! (나를 상속하시오~=부모 역할만 하겠다)
	
	public abstract void play(); // 내용 없고 선언만 하는 거 -> 추상 메소드, 1.객체화 안됨, 2.타입으로서 부모역할만 한다
	
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}

abstract class CDPlayer extends Player {
	public abstract void ff();
}

class CDDPlayer extends CDPlayer {	// 추상메소드는 강제 오버라이딩, 안 하면 컴파일에러
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
	
	@Override
	public void ff() {
	}
}

class DVDPlayer extends Player {
	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
}
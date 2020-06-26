package com.kita.first.level4;

public class Bird extends Animal { 	// 상속 받으면 Animal 안의 칭구덜 사용할 수 있게 됨(private이 아닐 경우)
									// flying() + crying(), eat()
									// 레퍼런스 변수 중 상속관계만이 형변환 가능 -> 다양성
	protected Bird(String name) { // 디폴트+상속관계, 패키지가 달라지더라도 상속관계라면 접근 가능
		super(name, "조류"); // 부모의 기본 생성자 Animal() {} <- 없다 <- 빨간줄, 해결방법:부모Animal의 기본생성자인 Animal(String, String) 호출
	}
	
	void flying() {
		System.out.println("훨~ 훨~");
	}
	
	@Override 	// 꼭! 꼭! 습관처럼 붙이기, 부모 중에 같은 이름 없으면 빨간 줄 띄워줌
	void crying() {	// 오버라이딩
		super.crying(); // 순서 상관 x, 생성자만 super();가 무조건 위에 있어야 함
		System.out.println("짹짹!!");
	}
}

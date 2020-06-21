package com.kita.first.level3;

public class TvTest {
	
	Tv tv; // 전역변수 : 값 없어도 자동으로 null 값 들어감
	
	public static void main(String[] args) {
		Tv tv1 = new Tv();	// 왼쪽 TV : (Reference Variable)참조변수 : 주소값 가지는 변수, 대문자로 시작
							//         TV 객체의 주소값만 가질 수 있음
							// 오른쪽 TV() : 기본 생성자, 객체 생성 시 딱 한 번만 씀
							// new : 객체 생성 키워드
		
		System.out.println("name: " + tv1.name);
		System.out.println("power: " + tv1.power);
		System.out.println("power: " + tv1.channel);
		
		System.out.println("--------------------");
		tv1.name = "삼성TV";
		System.out.println("name: " + tv1.name);
		tv1.changePower();
		System.out.println("power: " + tv1.power);
		tv1.changePower();
		System.out.println("power: " + tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("power: " + tv1.channel);
	}
}
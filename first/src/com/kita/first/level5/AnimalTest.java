package com.kita.first.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		//ani.sleep(); // Animal은 sleep() 모르므로 호출 불가능
		
		Cat cat = (Cat)ani; // sleep()메소드 아는 Cat 타입으로 변경
		cat.cry();
		cat.sleep();
		
		// 그 메소드 알고 있는 애들 중 최상위로 불러오기
	}
}

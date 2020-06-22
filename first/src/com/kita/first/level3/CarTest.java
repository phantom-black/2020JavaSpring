package com.kita.first.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("그랜저", "검정색", 3000);
		Car car2 = new Car("그랜저");
		Car car3 = new Car("G80");
		
		car1.name = "소나타";	// 안드로이드는 가능, 서버개발은 못하도록 막는다(멤버필드 private으로 만들어서)
		
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		System.out.println("---");
	}
}

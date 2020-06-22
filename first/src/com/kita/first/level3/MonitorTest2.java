package com.kita.first.level3;

public class MonitorTest2 {
	public static void main(String[] args) {
		Monitor.brand = "삼성";	// 객체마다 다른 값이 저장되었으면 하는 애들에게는 static 붙이면 안됨
		Monitor.printBrand();
		// Monitor.printInfo(); //<- static 안 붙은 것들은 무조건 객체화 필요
		
		Monitor m1 = new Monitor();
		m1.printInfo();	// 주소값.으로 메소드 호출
		
		int result = Integer.parseInt("11");
	}
}

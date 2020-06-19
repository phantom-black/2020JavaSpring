package com.kita.first.level2;

public class Method3 {
	public static void main(String[] args) {
		int result = sum(15, 10);	// sum(15, 10);도 가능
									// <- = 있으면 100퍼센트 비void 메소드
									// 비void형 메소드 만들 때 항상 return이 존재하도록 해야 함(조건식 안에 return 넣어둘 경우 안 만나는 경우 생김 > 오류)
		
		sum(30, 20); // <-도 가능, 가공만 필요하고 결과값은 필요치 않을 때 쓰임(거의 안 쓰임)
		System.out.println(result);
		
		result = minus(30, 17);
		System.out.println(result);
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;	// return String.valueOf(n1 + n2); <- 파싱
	}
	
	public static int minus(int n1, int n2) {
		if(n1 > 10) {
			return n1 - n2;	// return 만나면 메소드 종료
		}
		return 0;
	}
}

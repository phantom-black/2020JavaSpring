package com.kita.first.level2;

public class Method1 {
	//	메소드를 쓰는 이유: 소스를 호율적으로 만들 수 있다(메소드 한 번 만들고 나서는 호출만 하면 됨)
	
	public static void main(String[] args) {	
	// {void(리턴 타입) main(메소드명)(String[] args)(매개변수=파라미터)}-> 메소드의 선언부 /  {중괄호 안} <- 메소드 구현부	
	// void형 <- 회신x, 알아서 돌아감, return 넣는 거 옵션(안 넣어도 컴파일러가 자동으로 넣어줌)
	// 비void형 <- 회신ㅇ, 내가 받아야 함(주소값 혹은 일반변수(리터럴)값 하나만 옴), 무조건 return 넣어줘야
		
		Method1 me1 = new Method1();	// Method는 소속이 중요! 
										// static : 메모리에 알아서 올라감, static 안 붙으면 메모리에 수동으로 올려야 함
										// static 붙이면 다른 파일에서도 호출 가능
		sum(15, 10);	// 메소드 호출=메소드 콜 : 변수 개수, 타입 맞춰야만. 
						// 메소드명(이,놈,덜)<-argument, 인수, 인자
						// sum(15, 10);은 Method1.sum(10, 15);과 같다, 같은 파일 안에 있으므로 Method1. 생략 가능
		minus(20, 5);
	}
	
	// 메소드는 무조건 동급 <- 메소드 안에 메소드 정의할 수 없음!!
	
	public static void sum(int n1, int n2) {	// 메소드 정의 부분 
												// 매개변수=파라미터 : 외부로부터 값을 받아들이는 통로, 변수마다 타입 각각 지정해줘야
		System.out.println(n1 + n2); 	// 가공
		minus(n1, n2);
		// return; 안 넣어도 자동으로 넣어줌, return 다음에 다른 소스 올 수 없다
	}
	
	public static void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	  

}

package com.kita.first.level8;

public class TryCatchTest {
	// 통신 시 에러 많이 뜬다, 예외처리 구문 사용하여 런타임에러(실행오류) 방지
	public static void main(String[] args) {
		meth();
		
		//meth2(); // throws 사용 시 메소드 호출 시 try /catch문으로 해결해줘야 함(throws는 미루는 것)
		
		System.out.println("dddd");
		
		int a = div(10, 2);
		System.out.println("a: " + a);
	}
	
	public static int div(int n1, int n2) {
		try {
			return n1 / n2;
		} catch(Exception e) {
			return 0;
		}
		
	}
	
	public static void meth2() throws ClassNotFoundException {
		Class.forName("dsddd");
	}
	
	public static void meth() {
		int result = 2;
		// 해결사~
		try { // 예외 발생될 거 같은 구문 감싸기
			//result = 10 / 0; // 10.0일 때 f 안 붙이면 double 타입이라서 빨간줄ㅜ
			
			Class.forName("dd");
		} catch(ClassNotFoundException e) {
			
		} catch(Exception e) { // 예외 발생 시에만 실행, Exception e가 최상위 에러잡이, 모든 에러 다 잡을 수 있음, 제일 밑에 있어야 함
								// Exception e는 항상 넣기, 습관!!
			e.printStackTrace(); // 에러 프린트시키기
			System.out.println("예외가 발생하였습니다.");
			
		} finally { // finally는 옵션, 에러 유무 상관없이 무조건 실행되는 부분
					// try/catch문 안에 return 등 종료시키는 문장이 있을 경우, 무조건 실행시키고 싶을 때 finally 사용
			System.out.println("finally");
		}
		
		System.out.println("result: " + result);
		System.out.println("종료!");
	}
}

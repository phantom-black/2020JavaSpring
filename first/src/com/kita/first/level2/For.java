package com.kita.first.level2;

public class For {
	public static void main(String[] args) {
		
		//	   A		   B	 C
		for ( int i=0; i<10 ; i++ ) {	// for ( ; ; ) {} : 무한루프 // for ( 초기값(보통 int i = 0 아니면 1) ; 조건식 ; 증감식 )
			System.out.println(i + "반복문!!");	// D
		}
		
		
		// A > B > D > C
		//     B > D > C
		//	   B > D > C
		//......
	}
}

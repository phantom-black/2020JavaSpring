package com.kita.first;

public class PrintF {
	public static void main(String[] args) {
		String name = "박연진";
		int age = 27;
		float vision = 0.1f;
		char bloodType = 'A';
		
		System.out.println("나의 이름은 " + name + "입니다. 나의 나이는 " + age + "입니다."
		+ "나의 시력은 "+ vision + "입니다. 나의 혈액형은 " + bloodType + "입니다.");		// 문자열 + 다른 타입 -> 문자열로 변환(자동형변환)
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %d입니다. 나의 시력은 %.1f입니다. 나의 혈액형은 %c입니다.\n",
				name, age, vision, bloodType);	// %s : 문자열, %d : 정수, %f : 실수, %c : 문자 	--> 타입 일치해야. 전부 %s로 문자열 처리해도 출력됨   
												// %.1f : 소수점 한 자리까지, %.nf : 소수점 n자리까지
												// %5d, %05d로 총 자리수 결정,  %,d로 천의 자리마다 , 표시
		
		char v1 = '1';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		byte v2 = 66;	// int v2 = 66; 도 성립
		System.out.printf("%c : %d\n", (char)v2, v2);	// (char)v2 -> 문자열의 값 출력
	}	
}

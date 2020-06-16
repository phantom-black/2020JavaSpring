package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {
	/*
	 성별을 입력해 주세요: (남/여)
	 키를 입력해 주세요:
	 
	 남자 기준 : 160
	 여자 기준 : 150
	 
	 "평균 미만입니다."
	 "평균입니다."
	 "평균 초과입니다."
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요: (남/여)");
		String sex = scan.next();
		System.out.print("키를 입력해 주세요: ");
		int height = scan.nextInt();	// 실무는 무조건 String으로 받고 숫자만 있다면 파싱해준다
		if( "남".equals(sex) ) {
			if( height < 160 ) {
				System.out.println("평균 미만입니다.");
			} else if( height > 160 ) {
				System.out.println("평균 초과입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else if( "여".equals(sex) ) {
			if( height < 150 ) {
				System.out.println("평균 미만입니다.");
			} else if( height > 150 ) {
				System.out.println("평균 초과입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}
	}
}

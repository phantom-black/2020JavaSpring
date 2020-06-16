package com.kita.first.mission;

import java.util.Scanner;

public class Mission3_1 {
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

		
		if("남".equals(sex) || "여".equals(sex)) {
			
			System.out.print("키를 입력해 주세요: ");
			int height = scan.nextInt();	// 실무는 무조건 String으로 받고 숫자만 있다면 파싱해준다
			
			int standHeight = 150;	// <-무조건 값이 들어간다면 초기화 안해줘도 됨, 값이 없는 경우가 생기면 빨간줄	*어떤 역할을 하는 숫자 : 매직넘버
			
			if("남".equals(sex)) {
				standHeight = 160;
			}
			
			if( height < standHeight ) {
				System.out.println("평균 미만입니다.");
			} else if( height > standHeight ) {
				System.out.println("평균 초과입니다.");
			} else {
				System.out.println("평균입니다.");
			}
			
		} else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}

		

	}
}

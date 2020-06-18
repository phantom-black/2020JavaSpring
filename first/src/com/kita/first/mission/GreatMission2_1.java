package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menuArr = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] priceArr = {500, 600, 700, 800, 400, 400};
		
		System.out.println("-메뉴-");
		
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s(%d원)\n", i+1, menuArr[i], priceArr[i]);
		}
		
		int total = 0;
		while(true) {
			System.out.print("메뉴를 선택하세요: (종료:0)");
			int num = scan.nextInt();	// 메모: String을 int로 변환하는 법 복습하기 -> Mission5 참고
										/*
										 	String score = scan.next();
											int num = Integer.parseInt(score);
										 */
			
			if(num==0) {
				break;
			} else if(num<0 || num>menuArr.length) {
				System.out.print("잘못 입력!");
				continue;
			}
			
			int idx = num-1;
			System.out.printf("%s %d원\n", menuArr[idx], priceArr[idx]);
			total+=priceArr[idx];
		}
		scan.close();
		System.out.printf("종료! %d원 사용\n", total);
	}
}

package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	/* 자판기 게임 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] menuArr = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" };
		int[] priceArr = { 500, 600, 700, 800, 400, 400 };
		int num = 0;
		int total = 0;
		
		System.out.println("-메뉴-");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s (%d원)\n", i+1, menuArr[i], priceArr[i]);
		}
		
		while(true) {
			System.out.print("메뉴를 선택하세요: (종료:0)");
			num = scan.nextInt();
			if(num<0 || num>6) {
				System.out.println("범위 내의 숫자를 입력하세요.");
				continue;
			} else if(num == 0) {
				break;
			}
			
			total += priceArr[num-1];
			System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
			
		}
		scan.close();
		System.out.printf("종료! %d원 사용\n", total);
		
		
	}
}

package com.kita.first.mission;

import java.util.Scanner;
public class Mission7 {
	/*
 	숫자를 입력:(종료:0) 5
 	숫자를 입력: (종료:0) 7
 	숫자를 입력:(종료:0) 1
 	숫자를 입력: (종료:0) 0
 	합계 : 13
	 */
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("숫자를 입력: (종료:0)");
			int num = scan.nextInt();

			if( num==0 ) {
				break;
			}
			sum += num;
		}
		System.out.printf("합계 : %d", sum);
		
		System.out.println();
		
		sum = 0;
		while(true) {	
			System.out.println("숫자를 입력: (종료:0)");
			int num = scan.nextInt();
			
			if(num==0) {
				break;
			} else if(num%2==0) {	// 짝수값만 더하기
				sum += num;
			}
		}
		scan.close();
		System.out.printf("합계 : %d", sum);
	}
}

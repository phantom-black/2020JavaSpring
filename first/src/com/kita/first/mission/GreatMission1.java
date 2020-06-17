package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission1 {
	/* 숫자 야구 게임 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;
		
		System.out.printf("숫자 %d 야구 게임 시작\n", LEN);
		
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * 9 + 1);
			
			for(int z=0; z<i; z++) {
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			int s=0, b=0;
			
			System.out.print("숫자 입력: ");
			for(int i=0; i<myArr.length; i++) {
				myArr[i] = scan.nextInt();
			}
			
			for(int i=0; i<LEN; i++) {
				for(int z=0; z<LEN; z++) {
					if(rArr[i] == myArr[z]) {
						if(i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			if(s == LEN) {
				break;
			}
			
			System.out.printf("S:%d / B:%d / O:%d\n", s, b, (LEN-s-b));
			
			
		}
		scan.close();
		System.out.println("End!");
		
		/*
		final int LEN = 3;
		
		int[] rArr = new int[LEN];	// 
		int[] myArr = new int[LEN];
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<rArr.length; i++) { 
			rArr[i] = (int)(Math.random() * 9 + 1);
			for(int z=0; z<i; z++) {
				if(rArr[i]==rArr[z]) {
					i--;
					break;
				}
			}
		}
	
		while(true) {
			for(int i=0; i<LEN; i++) {
				System.out.print("숫자 입력: ");
				int num = scan.nextInt();
				myArr[i] = num;
				System.out.printf("값%d: %d\n", i+1, num);
			}
			
			for(int n=0; n<LEN; n++) {
				if(rArr[n]==myArr[n]) {
					strike++;
				} else {
					for(int z=0; z<LEN; z++) {
						if(rArr[n]==myArr[z]) {
							ball++;
						}
					}
				}
			}
			out = LEN - strike - ball;
		
			System.out.printf("S:%d / B:%d / O:%d\n", strike, ball, out);
			
			if(strike==LEN) {
				break;
			}
			
			strike=ball=out=0;
			

		}
		scan.close();
		System.out.println("종료!");
		
	*/
	}
	
}

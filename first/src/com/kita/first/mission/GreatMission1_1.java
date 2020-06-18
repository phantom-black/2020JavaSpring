package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int LEN = 3;
		
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		int max = 9;
		int min = 1;
		for(int i=0; i<LEN; i++) {
			rArr[i] = (int)(Math.random() * (max-min)+1)+min;
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
		
		int cnt = 0;
		while(true) {
			int s = 0, b = 0;
			
			for(int i=0; i<LEN; i++) {
				System.out.printf("값%d: ", i+1);
				int num = scan.nextInt();
				if(num < min || num > max) {
					i--;
					System.out.printf("%d에서 %d까지의 값을 입력하세요\n", min, max);
				} else {
					myArr[i] = num;
				}
			}
			
			for(int i=0; i<LEN; i++) {
				for(int z=0; z<LEN; z++) {
					if(rArr[i] == myArr[z]) {
						if(i==z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			System.out.printf("S:%d / B:%d / O:%d\n", s, b, (LEN-s-b));
			cnt++;
			
			if(s==LEN) {
				break;
			}
		}
		scan.close();
		System.out.printf("%d회 시도 - End!", cnt);
	}
}

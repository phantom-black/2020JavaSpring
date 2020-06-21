package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission1_2 {
	/*
	 * 숫자 야구 게임 숫자 LEN개 겹치지 않게 뽑아두고 LEN개의 숫자 입력
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;

		System.out.printf("숫자 %d 야구 게임 시작!\n", LEN);

		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];

		int min = 1;
		int max = 9;
		for (int i = 0; i < LEN; i++) { // LEN = rArr.length
			rArr[i] = (int) (Math.random() * (max - min + 1)) + min;

			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}

		int cnt = 0;
		while (true) {
			int s = 0, b = 0;
			for (int i = 0; i < LEN; i++) {
				System.out.printf("값%d : ", i + 1);
				int num = scan.nextInt();
				if (num < min || num > max) {
					System.out.printf("%d에서 %d까지의 값을 입력하세요\n", min, max);
					i--;
					continue;
				}
				myArr[i] = num;
				/*
				 * String num = scan.next(); myArr[i]=Integer.parseInt(num);
				 */
			}

			for (int i = 0; i < LEN; i++) {
				for (int z = 0; z < LEN; z++) {
					if (rArr[i] == myArr[z]) {
						if (i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.printf("S:%d, B:%d, O:%d", s, b, (LEN - s - b));
			cnt++;

			if (s == LEN) {
				break;
			}

		}
		scan.close();
		System.out.printf("%d회 시도 - END!", cnt);
	}
}

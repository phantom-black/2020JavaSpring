package com.kita.first.mission;

import java.util.Scanner;

public class Mission8 {
	/*
 	랜덤값 10~90을 맞추는 게임
 	
 	UP / DOWN /Great!!
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 10;
		int max = 90;
		System.out.printf("랜덤값 %d~%d을 맞추는 게임", min, max);
		int rVal = (int)(Math.random() * (max - min + 1) + min);
		
		while (true) {
			System.out.print("값 입력: ");
			int val = scan.nextInt();
			
			if(val < min || val > max) {
				System.out.println("범위 이내의 값을 입력하세요.");
			} else if(rVal > val) {
				System.out.println("UP");
			} else if (rVal < val) {
				System.out.println("DOWN");
			} else {
				break;
			}
			
			System.out.print("Great!!");
			scan.close();
		}
	}
}

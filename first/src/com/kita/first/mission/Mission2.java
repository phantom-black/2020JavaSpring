package com.kita.first.mission;

import java.util.Scanner;

public class Mission2 {
	/* 
	  스캐너로 정수값 하나 입력 받고
	  그 값이 홀수면 "홀수입니다."
	  짝수면 "짝수입니다."
	  */
	public static void main(String[] args) {
		System.out.print("정수값을 하나 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if(num%2 == 1) {
			System.out.println("홀수입니다");
		} else {
			System.out.println("짝수입니다");
		}
	}
}

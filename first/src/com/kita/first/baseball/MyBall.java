package com.kita.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int n) {
		init(n);
	}
	
	private void init(int n) {
		myArr = new int[n];
		scan = new Scanner(System.in); 
	}
	
	public void setNumbers() {
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("숫자%d: ", i+1);
			String val = scan.nextLine();
			try {
				myArr[i] = Integer.parseInt(val); // 
			} catch(Exception e) {
				i--;
				System.out.println("1~9 사이의 숫자를 입력하세요.");
				continue;
			}
			
			for(int z=0; z<i; z++) {
				if(myArr[z]==myArr[i]) {
					i--;
					System.out.println("중복된 값이 존재합니다.");
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr));
	}
	
	public int get(int idx) {
		return myArr[idx];
	}
}

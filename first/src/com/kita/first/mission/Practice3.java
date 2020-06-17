package com.kita.first.mission;

public class Practice3 {
	
	public static void main(String[] args) {
		int len = 9;
		int[] arr = new int[len];
		// 1~9 사이의 랜덤한 값을 중복되지 않게  arr배열 크기만큼 초기화한다.
		
		int max = 9;
		int min = 1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (max-min+1)+min);
			for(int z=0; z<i; z++) {
				if(arr[i]==arr[z]) {
					i--;
					break;
				}
			}
		}
		
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		
	}
}

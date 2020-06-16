package com.kita.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		
		// arr[0] = arr[1];
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		int num = 0;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		// 순차정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				
				if(arr[i]>arr[z]) {
					num = arr[i];
					arr[i] = arr[z];
					arr[z] = num;
				}
			}
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
		

	}
}

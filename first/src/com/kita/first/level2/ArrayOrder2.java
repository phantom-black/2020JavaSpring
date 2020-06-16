package com.kita.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		// 선택정렬
		int min = 0;
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int z=i+1; z<arr.length; z++) {
				
				if(arr[min]>arr[z]) {
					min = z;
				}
			}
			// 스와핑
			if(min!=i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
			}

			for(int val : arr) {
				System.out.print(val + ", ");
			}
			
		}

}

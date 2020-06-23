package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest {
	// 파일명과 이름 같은 클래스가 있어야 메인 메소드가 돌아감
	// class 앞에  public은 파일명과 이름 같은 클래스만 붙일 수 있음
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); // 10
		
		list.remove();
		
	}
}

class MyList {
	
	private int[] arr;
	
	MyList() {
		init();
	}
	
	private void init() {
		arr = new int[0];
	}
	
	void add(int num) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	int size() {
		return arr.length;
	}
	
	int get(int i) {
		return arr[i];
	}
	
	void remove() {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
}



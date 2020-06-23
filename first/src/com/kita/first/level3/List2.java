package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		/*
		Object obj = 1;
		obj = "aaa";
		obj = 1.1;
		
		System.out.println((float)obj + (float)obj); // Object는 사용할 때 강제형변환 해줘야 함 
		*/
		
		ArrayList<Integer> list = new ArrayList(); 	// ArrayList<Integer> : 제네릭
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		// list.add("ddd");
		list.add(2, 11); 	// 2번째에 11을 넣겠다
		
		list.remove(list.size() - 1);
		list.remove(list.size() - 1);
		
		int value = list.get(2);
		System.out.println(value);
		
		for(int i=0; i<list.size(); i++) {
			int val = (int)list.get(i);
			System.out.print(val + ", ");
		}
		System.out.println();

		for(int val : list) {
			System.out.print(val + ", ");
		}
	}
}

package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest {
	// 파일명과 이름 같은 클래스가 있어야 메인 메소드가 돌아감
	// class 앞에  public은 파일명과 이름 같은 클래스만 붙일 수 있음
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(1, 1200);	// 10, 15, 20 > 10, 1200, 15, 20
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); // 10
		
		list.remove();
		//int delVal = list.remove(); // 마지막 값 지우고, 지우는 값을 리턴! (20)
		int delVal = list.remove(2);
		
		MyArrays.print(list); // [10, 1200, 15] 프린트 되도록!!
		String str = MyArrays.toString(list); // [10, 1200, 15]" 문자열을 리턴하도록!
		// Arrays.toString  메소드 사용금지!!! 구현하기
		System.out.println(str);
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
	/*
	void add(int num) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	*/
	int size() {
		return arr.length;
	}
	
	int get(int i) {
		return arr[i];
	}
	/*
	void remove() {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	*/
	
	/*
	void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<idx; i++) {
			temp[i] = arr[i];
		}
		temp[idx] = n;
		for(int z=idx+1; z<temp.length; z++) {
			temp[z] = arr[z-1];
		}
		arr=temp;
		System.out.println(Arrays.toString(arr));
	}
	*/
	/*
	void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<temp.length; i++) {
			if(i<idx) {
				temp[i]=arr[i];
			} else if(i>idx) {
				temp[i]=arr[i-1];
			}
		}
		temp[idx]=n;
	}
	*/
	void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[(i<idx) ? i : i+1] = arr[i];
		}
		temp[idx]=n;
		arr=temp;
	}
	
	void add(int num) {
		add(arr.length, num);
	}
	/*
	 	void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {

			if(i<idx) {
				temp[i]=arr[i];
			} else {
				temp[i+1]=arr[i];
			}
		}
		temp[idx]=n;
		arr=temp;
	}
	 */
	/*
	void remove(int idx) {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			if(i<idx) {
				temp[i] = arr[i];
			} else if(i>idx) {
				temp[i]=arr[i+1];
			}
		}

		arr=temp;
		System.out.println(Arrays.toString(arr));
	}
	*/
	
	int remove() {
		return remove(arr.length-1);
		
	}
	
	int remove(int idx) {
		int[] temp = new int[arr.length-1];
		int n = arr[idx];
		for(int i=0; i<temp.length; i++) {
			if(i<idx) {
				temp[i] = arr[i];
			} else if(i>idx) {
				temp[i]=arr[i+1];
			}
		}

		arr=temp;
		System.out.println(Arrays.toString(arr));
		return n; 
	}
	
}


class MyArrays {
	static void print(MyList arr) {
		int[] temp = new int[arr.size()];
		for(int i=0; i<arr.size(); i++) {
			temp[i]=arr.get(i);
		}
		System.out.println(Arrays.toString(temp));
	}
	
	static String toString(MyList arr) {
		String str = "";
		for(int i=0; i<arr.size(); i++) {
			if(i>0) { str += ", "; }
			str+=arr.get(i);
		}
		// return "[" + str + "]";
		return String.format("[%s]", str);
	}
}


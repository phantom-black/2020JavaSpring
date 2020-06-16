package com.kita.first;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// static : 자동으로 메모리에 올라감 <-> new : 메모리에 올릴 때 쓰는 키워드
		// java.util.Scanner scan = new java.util.Scanner(System.in); 로 써도 되고 임포트해서 써도 됨
		System.out.print("나이?");
		int age = scan.nextInt();	// nextInt() 정수값 가져올 때. 입력 대기중 -> 입력 시 다음으로 넘어감
		System.out.println("나이 : " + age);
		
		System.out.print("이름?");
		String name = scan.next();
		System.out.println("이름 : " + name);
		scan.close(); 	// 다 사용 후 stream 종료해야 -> stream(input/output) 메모리 많이 잡아먹기 때문, 효율 떨어지므로
	}
}

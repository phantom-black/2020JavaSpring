package com.kita.first.level2;

public class Break {
	public static void main(String[] args) {

		for (int z = 0; z < 10; z++) {
			for (int i = 0; i < 100; i++) {
				for(int e=0; e<3; e++) {
					if (z == 3) { break; } // 가장 가까운 반복문 종료
					System.out.printf("%d - %d\n", z, i);
				}
			}
		}
	}
}

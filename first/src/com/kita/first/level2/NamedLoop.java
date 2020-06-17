package com.kita.first.level2;

public class NamedLoop {
	public static void main(String[] args) {

		Parent: 
		for (int i = 0; i < 5; i++) {
			Parent2: 
			for (int z = 0; z < 20; z++) {
				if (z == 15) {
					break Parent;	// continue: skip, break: 종료
									// <- break; 와 continue Parent;의 결과가 같다
				}
				System.out.printf("%d - %d\n", i, z);
			}
		}
	}
}

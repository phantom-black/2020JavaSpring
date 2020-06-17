package com.kita.first.level2;

public class Continue {
	public void main(String[] args) {
		for (int i=0; i<20; i++) {
			
			if(i == 5) { continue; }	// skip, 가장 가까운 for문(반복문) 종료하지 않고 밑의 것이 실행되지 않았으면 좋겠을 때 -> 바로 for문 다음으로 감
										// break : 반복문 종료해버림
			System.out.println(i);
		}
	}
}

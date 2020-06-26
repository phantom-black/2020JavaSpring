package com.kita.first.baseball;

public class Checker {
	
	// S:0 / B:0 / O:0
	// 성공하면 false, 성공 전이면 true
	public static boolean check(int gameCnt, Baseball b, MyBall mb) {
		
		int strike=0;
		int ball=0;
		int out = 0;
		
		for(int i=0; i<gameCnt; i++) {
			for(int z=0; z<gameCnt; z++) {
				if(b.get(i)==mb.get(z)) {
					if(i==z) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		
		}
		
		out = gameCnt-strike-ball;
		System.out.printf("Strike : %d Ball: %d Out:%d \n",strike,ball,out);
		
		return strike != gameCnt;
	}
}

package com.kita.first.baseball;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		do {
			myBall.setNumbers();
		} while(Checker.check(gameCnt, ball, myBall));
		
		/*
		myBall.setNumbers();
		int val = myBall.get(0);
		//숫자1: 3
		//숫자2: 6
		//숫자3: 8
		*/
		System.out.println("게임종료");
	}
}
    
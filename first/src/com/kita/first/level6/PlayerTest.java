package com.kita.first.level6;

public class PlayerTest {
	public static void main(String[] args) {
		//Player player = new Player(); // 객체화 안됨, Player 클래스가 추상클래스이므로
		CDPlayer player = new CDDPlayer();
		player.play();
		player.ff();
		
		Player player2 = new DVDPlayer();
		player2.play();
	}
}

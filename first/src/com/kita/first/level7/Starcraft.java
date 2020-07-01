package com.kita.first.level7;

public class Starcraft {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
		/*
		m1.attack(m2);
		m1.attack(m2);
		
		System.out.println("m1: " + m1);
		// 마린, 현재 HP: 50
		System.out.println("m2: " + m2);
		*/
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		
		System.out.println(m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		
		medic.heal(fb);
		medic.heal(m1);
		
		System.out.println(fb instanceof Carable); // 형변환 불가능 - false
		System.out.println(m1 instanceof Carable); // 형변환 가능 - true
	}
}

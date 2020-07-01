package com.kita.first.level7;

public class Marine extends Unit implements AttackUnit, Carable { // 클래스일 때 인터페이스는 implements(구현)로 상속
										// 한 클래스에 여러 개의 인터페이스 상속 가능 implements aa, implements bb 형태로
	
	private int damage;
	
	public Marine() {
		super("마린", 50); // 50: 최대체력 <- 이렇게 적어주기라도 하면 나중에 볼 때 편함
		damage = 5;
	}
	
	@Override
	public void attack(Unit u) {
		if(u==this) {
			return;
		}
		System.out.println("따다다다~");
		u.getDamage(damage);
	}
}

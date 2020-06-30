package com.kita.first.level4;

// class 앞에 final 붙이면 상속 불가, 변수 앞에 붙이면 상수화, 메소드 앞에 붙이면 Override 금지
// 접근지시어도 final처럼 세 군데에 붙일 수 있음
// static은 변수와 메소드 앞에 붙일 수 있음
public class Value {
	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	public void print() { // final 넣으면 Override 금지
		System.out.println(getVal() + "하하");
	}
	
	@Override
	public boolean equals(Object obj) {
		Value objValue = (Value)obj;
		/*
		if( val == objValue.getVal() ) {
			return true;
		}
		return false;
		*/
		/*
		boolean result = (val == objValue.getVal()) ? true : false;
		return result;
		*/
		return this.val == objValue.getVal();
	}
	
	@Override
	public String toString() {
		return String.format("%,d", val);
		// return String.valueOf(val);
		// return val + "";
	}
}

class Value2 extends Value {
	public Value2(int val) {
		super(val);
	}
	
	public void print() {
		System.out.println(getVal() + "하하");
	}
}

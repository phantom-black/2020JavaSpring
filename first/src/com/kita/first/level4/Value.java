package com.kita.first.level4;

public class Value {
	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value val2 = (Value)obj;
		/*
		if( val == val2.getVal() ) {
			return true;
		}
		return false;
		*/
		boolean result = (val == val2.getVal()) ? true : false;
		return result;
	}
}

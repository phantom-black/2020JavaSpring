package com.kita.first.mission;

public class Mission6_6 {
	public static void main(String[] args) {
		
		int star = 7;
		for(int i=0; i<star; i++) {
			for(int n=0; n<i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int ln = 1;
		int st = 0;
		
		for(int x=0; x<star*star; x++) {
			
			System.out.print("*");
			st++;
			
			if( ln == st ) {
				System.out.println();
				ln++;
				st=0;
			}
			
			if(ln > star) {
				break;
			}

		}
	}
}

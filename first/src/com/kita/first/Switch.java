package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		
		String num = "사";
		
		switch(num) {	// 폭포수, 진입했다면 break 만나기 전까지 순차적으로 전부 실행, 문자열 비교할 때 좋음(equals 안 써도 됨)
			case "일":
				System.out.println("1이다");
				break;
				
			case "이": case "사":
				System.out.println("짝수이다");
				break;
				
			case "삼":
				System.out.println("3이다");
				break;
				
			default:	// 필수 아님, if문의 else 같은 것
				System.out.println("1~3이 아니다!");
				break;	// switch문 마지막의 break는 생략해도 됨, 어차피 끝나므로
		}
	}
}

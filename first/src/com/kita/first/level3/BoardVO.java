package com.kita.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {} // 안에 super(); 들어갈 것
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}	// 외부에서 필드로 값 넣는 방법 마련1
	
	// 메소드 통해서 값 넣는 방법
	// title 세터
	public void setTitle(String title) {
		this.title = title;
	}
	// title 게터
	public String getTitle() {
		return title;
	}
	
	// content 세터
	public void setContent(String content) {
		this.content = content;
	}
	// content 게터
	public String getContent() {
		return content;
	}
	
	// writeId 세터
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	// writeId 게터
	public int getWriteId() {
		return writeId;
	}
	
	// setter는 무조건 void, 무조건 set으로 시작
	// public void set~() {
}

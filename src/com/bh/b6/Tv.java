package com.bh.b6;

public class Tv extends Same {

	private int size;
	
	//기본 생성자
	public Tv() {
//		평소엔 생략되어있음.
		super();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void info() {
		super.info();
		System.out.println("SIZE : "+this.size);
	}


}

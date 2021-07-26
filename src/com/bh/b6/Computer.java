package com.bh.b6;

public class Computer extends Same {

	private int ssd;

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	
	public void info() {
		super.info();
		System.out.println("Ssd : "+this.ssd);
	}
}

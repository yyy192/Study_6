package com.bh.b4;

public class Tiger extends Animal{

	private String weapon;
	
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void sound() {
		
		System.out.println("네 안의 호랑이 쿠와아아앙!!");
		
	}
	
	public void wash() {
		System.out.println("온천욕 하기");
	}
	
}

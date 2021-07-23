package com.bh.b5;

public class S5Main {

	public static void main(String[] args) {
		
		Character character = new Character();
		Sword sword = new Sword();
		character.weapon = sword;
		
		character.weapon.attack();
		
		//사냥 성공했더니 Gun을 drop
		System.out.println(" ");
		System.out.println("사냥 성공 총 획득");
		System.out.println(" ");
		
		Gun gun = new Gun();
		character.weapon = gun;
		character.weapon.attack();
	}

}

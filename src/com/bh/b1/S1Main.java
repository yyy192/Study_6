package com.bh.b1;

public class S1Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tablet tablet = new Tablet();
		
		computer.setBrand("Galaxy book");
		phone.setBrand("Galaxy note10");
		tablet.setBrand("Galaxy tab s6lite");
		
		computer.info();
		phone.info();
		tablet.info();
		
		computer.info2();
	}

}

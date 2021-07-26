package com.bh.b6;

public class Aircon extends Same {
	
	private int pyung;
	
	public int getPyung() {
		return pyung;
	}

	public void setPyung(int pyung) {
		this.pyung = pyung;
	}

	public void info() {
		super.info();
		System.out.println("Pyung : "+this.pyung);
	}
	

}

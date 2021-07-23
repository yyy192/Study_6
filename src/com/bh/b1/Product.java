package com.bh.b1;

//super class 추상 클래스
public abstract class Product {
	
//	public void info2();
	private String brand;
	private String cpu;
	private int ram;
	private int price;
	
	//추상 메서드
	public abstract void info();
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}

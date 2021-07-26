package com.bh.b6;

public class S6Main {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.setBrand("Samsung");
		tv.setColor("Black");
		tv.setPrice(3000000);
		tv.setPoint(300);
		tv.setSize(100);
		
		Computer computer = new Computer();
		computer.setBrand("LENOVO");
		computer.setColor("Silver");
		computer.setPrice(1700000);
		computer.setPoint(17);
		computer.setSsd(512);
		
		Aircon aircon = new Aircon();
		aircon.setBrand("LG");
		aircon.setColor("Green");
		aircon.setPrice(1500000);
		aircon.setPoint(15);
		aircon.setPyung(6);
		
		tv.info();
		computer.info();
		aircon.info();
		
		Guest bh = new Guest();
		bh.setMoney(5000000);
		bh.setPoint(10);
		//buy메서드
		
//		bh.buy(aircon);
		
		Same [] sames = new Same[2];
		sames[0] = computer;
		sames[1] = tv;
		
		bh.buy(sames);
		
		
		//Guest의 돈, 포인트 출력
		System.out.println("===================");
		bh.info();
	}

}

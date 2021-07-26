package com.bh.b6;

public class Guest {
	
	private int money;
	private int point;
	
	//물건의 가격, 포인트 받기
	//매개변수는 한 개만 선언 가능
//	public void buy(Same same) {
//		
//		this.money = this.money-same.getPrice();
//		this.point = this.point+same.getPoint();
//	}
		
	//물건 여러개를 샀을 때 계산하는 메서드
	//매개변수는 한 개만 선언 가능
	
	public void buy(Same [] sames) {
		 
		for(int i=0;i<sames.length;i++) {
			this.money = this.money-sames[i].getPrice();
			this.point = this.point+sames[i].getPoint();
		}
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void info() {
		System.out.println("BH의 MONEY : "+this.money);
		System.out.println("BH의 POINT : "+this.point);
	}
	

}

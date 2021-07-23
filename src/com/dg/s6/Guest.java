package com.dg.s6;

public class Guest {
	
	private int money;
	private int point;
	
	//매개변수는 1개만 선언 가능
	public void buy(Elec elec) {
		
		this.money=this.money-elec.getPrice();
		System.out.println(this.money);
		
		this.point=this.point+elec.getPoint();
		System.out.println(this.point);
		
	}
	//여러개를 샀을 때 계산 하는 메서드
	//매개변수는 1개만 선언 가능
	
	public void buy(Elec [] elec) {
		for(int i=0;i<elec.length;i++) {
			this.money = this.money-elec[i].getPrice();
			this.point = this.point-elec[i].getPoint();
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

}

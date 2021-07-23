package com.dg.s6;

public class S6Main {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		Computer computer = new Computer();
		Tv tv = new Tv();
		
		tv.setBrand("Samsung");
		tv.setColor("Black");
		tv.setPrice(3000000);
		tv.setPoint(300);
		tv.setVol(100);
		
		computer.setBrand("LG");
		computer.setColor("White");
		computer.setPrice(1700000);
		computer.setPoint(17);
		computer.setSsd(512);
		
		aircon.setBrand("Carrier");
		aircon.setColor("Blue");
		aircon.setPrice(1500000);
		aircon.setPoint(10);
		aircon.setPyung(6);
		
		tv.info();
		computer.info();
		aircon.info();
		
		Guest iu = new Guest();
		
		iu.setMoney(5000000);
		iu.setPoint(10);
		//buy
		
		iu.buy(tv);
		
		Elec [] elecs = new Elec[2];
		elecs[0]=tv;
		elecs[1]=aircon;
		
		iu.buy(elecs);
		
		System.out.println(iu.getMoney());
		System.out.println(iu.getPoint());
	}

}

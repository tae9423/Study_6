package com.dg.s1;

public class S1Main {

	public static void main(String[] args) {
		Computer cp = new Computer();
		Phone ph = new Phone();
		Tablet tb = new Tablet();
		
		cp.setCompany("갤럭시 북");
		ph.setCompany("Apple");
		
		System.out.println(cp.getCompany());
		System.out.println(ph.getCompany());
		
		cp.info();
		ph.info();
		tb.info();
		
		cp.info2();
		
			
		
	}

}

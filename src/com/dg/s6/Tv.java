package com.dg.s6;

public class Tv extends Elec{
	
	private int vol;
	
	
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public void info() {
		super.info();
		System.out.println("Vol : "+this.vol);
	}
	

}

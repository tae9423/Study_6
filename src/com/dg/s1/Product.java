package com.dg.s1;

public abstract class Product {
	
	private String company;
	private String cpu;
	private int ram;
	private int price;
	
	
	public abstract void info(); 
	
	public void info2() {}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String brand) {
		this.company = brand;
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

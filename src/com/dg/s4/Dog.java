package com.dg.s4;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void guard() {
		System.out.println("집 지키기");
	}

}

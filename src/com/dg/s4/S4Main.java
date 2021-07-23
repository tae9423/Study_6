package com.dg.s4;

public class S4Main {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		tiger.sound();
		tiger.wash();
		cat.sound();
		cat.drop();
		dog.sound();
		dog.guard();

		Animal animal = tiger;
		animal = cat;
		animal = dog;
		
		Animal [] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;
		
		for(int i=0;i<animals.length;i++) {
			animals[i].sound();
		}
		
		
		System.out.println("=======================");
		
		Animal a = animals[1];
		
		tiger = (Tiger)a;		
		
		System.out.println(a instanceof Tiger);
		
		System.out.println("======================");
		Tiger t2 = new Tiger();
		Animal a2 = t2;
		
		Animal animal2 = new Animal();
		Tiger tiger2 = (Tiger)animal2;
		tiger2.sound();
		tiger2.wash();
	}

}

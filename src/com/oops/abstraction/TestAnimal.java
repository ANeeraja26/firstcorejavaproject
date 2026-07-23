package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("********** Cat info ********************");
		Animal c = new Cat();
		c.drink();
		c.eat();
		c.sound();
		
		
		System.out.println("************* dog info************");
		Animal d=new Dog();
		d.drink();
		d.eat();
		d.sound();
		
		System.out.println("************* monkey info************");
		Animal m=new Monkey();
		m.drink();
		m.eat();
		m.sound();


	}

}

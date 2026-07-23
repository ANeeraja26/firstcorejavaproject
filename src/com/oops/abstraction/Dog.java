package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("bow bow");
	}

	@Override
	public void drink() {
		System.out.println("Dog drink milk and water");
	}

	@Override
	public void eat() {
		System.out.println("dog eats non-veg");
	}

}

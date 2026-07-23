package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("ohh");
	}

	@Override
	public void drink() {
		System.out.println("monkey drink all");
	}

	@Override
	public void eat() {
		System.out.println("monkey eats banana");
	}

}

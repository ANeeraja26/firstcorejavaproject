package com.oops.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("meow meow");
	}

	@Override
	public void drink() {
		System.out.println("cat drink milk");
	}

	@Override
	public void eat() {
		System.out.println("cat can eat rat");
	}

}

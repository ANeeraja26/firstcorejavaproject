package com.language.constructor;

public class Customer {

	int id;
	String name;
	int age;
	long phone;

	public Customer() {
		this(1,"Ram");
		System.out.println("No arg constuctor called");

	}

	public Customer(int id, String name, int age, long phone) {
		System.out.println("4 Parameterzied constuctor called");

		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	

	public Customer(int id, String name) {
		System.out.println("two arg constuctor called");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		Customer c1 = new Customer();
		c1.show();
		
		Customer c3=new Customer(102,"neeru");
		c3.show();

		Customer c2 = new Customer(100, "neeraja", 23, 9392436650L);
		c2.show();

		System.out.println("Main method ended");

	}

	void show() {

		System.out.println("Customer ID:" + id);
		System.out.println("Customer NAME:" + name);
		System.out.println("Customer AGE:" + age);
		System.out.println("Customer PHONE:" + phone);

	}

}

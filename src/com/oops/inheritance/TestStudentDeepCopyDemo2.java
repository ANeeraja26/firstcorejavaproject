package com.oops.inheritance;

class Address1 {
	String city;

	public Address1(String city) {
		this.city = city;
	}

	// Copy Constructor
	public Address1(Address1 add) {
		this.city = add.city;
	}
}

class Student1 {
	String name;
	int age;
	Address1 add;

	public Student1(String name, int age, Address1 add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}

	// Copy Constructor (Deep Copy)
	public Student1(Student1 s) {
		this.name = s.name;
		this.age = s.age;
		this.add = new Address1(s.add);
	}
}

public class TestStudentDeepCopyDemo2 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		Address1 add = new Address1("Hyd");

		Student1 st1 = new Student1("Neeru", 21, add);

		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.add.city);

		System.out.println("*************************");

		Student1 st2 = new Student1(st1);

		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.add.city);

		System.out.println("*************************");

		st2.name = "Ram";
		st2.age = 18;

		st2.add.city = "Chennai";

		System.out.println("Student2");
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.add.city);

		System.out.println("*************************");

		System.out.println("Student1");
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.add.city);
	}
}
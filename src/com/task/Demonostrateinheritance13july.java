package com.task;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displaydetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student extends Person {
	int rollno;

	Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}

	void displayStudent() {
		System.out.println("Roll No: " + rollno);
	}
}

public class Demonostrateinheritance13july {

	public static void main(String[] args) {
		System.out.println("main method started");

		Student s = new Student("Neeraja", 24, 100);
		s.displaydetails();
		s.displayStudent();

	}

}

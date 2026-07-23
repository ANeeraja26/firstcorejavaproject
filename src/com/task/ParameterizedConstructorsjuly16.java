package com.task;

class Address {
	String city, state;

	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

}

class Student1 {
	int rollno;
	String name;
	Address a;

	Student1(int rollno, String name, Address a) {
		this.rollno = rollno;
		this.name = name;
		this.a = a;
		
		
	}
	
	void display() {
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("City:"+a.city);
		System.out.println("State:"+a.state);

		
	}

}

public class ParameterizedConstructorsjuly16 {

	public static void main(String[] args) {
		
		Address a1=new Address("Hyd","TG");
		Student1 s1=new Student1(100,"Neeraja",a1);
		
		s1.display();

	}

}

package com.collections;

public class Employee {

	int id;
	String name;
	int salary;
	int age;

	@Override
	public String toString() {
		return "Employee info[Employee Id : " + id + " , " + "Employee name :" + name + "Employee sal :" + salary
				+ ",Employee age :" + age;

	}

	Employee(int id, String name, int salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;

	}

}

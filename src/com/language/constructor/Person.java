package com.language.constructor;

public class Person {
	
	int age;
	String name;
	long phone;
	String city;
	
	Person(){
		System.out.println("no arg constructor called");
		age=20;
		name="unknown";
		phone=0;
		city="unknown";
		
		
	}
	
	Person(int age, String name, long phone, String city){
		System.out.println("parameterized constructor called");
		
		this.age=age;
		this.name=name;
		this.phone=phone;
		this.city=city;
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
	System.out.println("main method started");
	
	Person p=new Person(23,"neeraja",9392436650L,"hyd");
	p.show();
	
	
	}
	
	 void show(){
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		System.out.println("phone:"+phone);
		System.out.println("city:"+city);
	}

}

package com.languagefundamentals;

class Student{
	
	int sid=1;
	String name="Neeraja";
	double weight=45;
	float height=5.9F;
	Address address=new Address();
	
	
	
}

class Address{
	int flat=123;
	String plot="LIG";
	String street="kphb";
	String city="HYD";
	
}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		System.out.println("main method strated");
		
		Student s =new Student();
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.weight);
		System.out.println(s.height);
		System.out.println(s.address.flat);
		System.out.println(s.address.plot);
		System.out.println(s.address.street);
		System.out.println(s.address.city);
		
		System.out.println("mian method ended");
		
		

	}

}

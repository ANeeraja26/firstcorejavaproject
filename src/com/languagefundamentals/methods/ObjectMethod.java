package com.languagefundamentals.methods;

class Student1 {
	int sid=100;
	String name="Neeraja";
	int age=23;
	long phone=9392436650L;
	
	
}


public class ObjectMethod {
	static Student1 show() {
		
	
	Student1 s=new Student1();
	return s;
	}
	

	public static void main(String[] args) {
		System.out.println("main method called");
		Student1 s=show();
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.phone);
		
		System.out.println("main method ended");
			
		}

	}



package com.languagefundamentals.methods;



public class ObjectMethod2 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.sid=101;
		
		empDetalis(s1);
		
		
		
			
		}
	
	static void empDetalis(Student1 s) {
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.phone);
		
	}
	
	

	}



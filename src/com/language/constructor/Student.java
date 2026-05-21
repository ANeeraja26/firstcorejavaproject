package com.language.constructor;

public class Student {
	
	int sid;
	String name;
	
	
	
	Student(){
		sid=100;
		name="Neeraja";
		System.out.println("no arg constructor called");
	}

	public static void main(String[] args) {
		
   System.out.println("main method started");
   
   
   Student s=new Student();
   System.out.println(s.sid);
   System.out.println(s.name);
   
   Student s1=new Student();
   System.out.println(s1.sid);
   System.out.println(s1.name);
   
   
   
   
   
   System.out.println("main method ended");
	}

}

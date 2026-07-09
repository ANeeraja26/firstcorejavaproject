package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setsid(18);
		s1.setsname("Neeraja");
		s1.setage(24);
		
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getAge());
		
		// Direct Access from outside of the class
		// the process is consider hiding the data from outside of the classes using
		// private keyword
		// ******************* stoPping the direct access*************************
		// s1.sid = 100;// The field Student.sid is not visible
		// s1.sname = "Neeraja";//The field Student.sname is not visible
		// s1.age = 24;//The field Student.age is not visible

		// System.out.println(s1.sid);
		// System.out.println(s1.sname);
		// System.out.println(s1.age);
	}

}

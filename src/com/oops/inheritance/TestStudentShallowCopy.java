package com.oops.inheritance;

class Student implements Cloneable {

	int sid;
	String sname;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		
		
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(100, "Neeru", new Address(""));
		s1.clone();
	}

}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestStudentShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started");

		Address add = new Address("Hyd");
		Student s1 = new Student(101, "Neeraja", add);
		System.out.println("*********** object 1 ***************");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("*************************");

		Student s2 = (Student) s1.clone();
		System.out.println("************ object 2  ***************");
		s2.sid = 102;
		s2.sname = "Rami";
		s2.address.city = "Benglore";
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("*************************");

		System.out.println(" a few minutes later");
		System.out.println("***************** object 1 *****************");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("*************************");

	}

}

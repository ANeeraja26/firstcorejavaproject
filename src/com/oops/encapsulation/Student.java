package com.oops.encapsulation;

// POJO
//DTO
//DATA MODEL
public class Student {

	private int sid;
	private String sname;
	private int age;
	
	public void setsid(int sid) {
		this.sid=sid;
	}
	
	public int  getSid() {
	return sid;
	}
	
	public void setsname(String  sname) {
		this.sname=sname;
	}
	
	public String  getSname() {
	return sname;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public int  getAge() {
	return age;


	}

}

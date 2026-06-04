package com.task;

// Login Status

public class LogicalStaTestDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String user="admin";

		if(user.equals("admin"))
		    System.out.println("Admin Login");
		else if(user.equals("guest"))
		    System.out.println("Guest Login");
		else
		    System.out.println("Invalid User");
	}

}

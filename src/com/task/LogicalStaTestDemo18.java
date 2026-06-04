package com.task;


// Electricity Bill Category
public class LogicalStaTestDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int units=250;

		if(units<=100)
		    System.out.println("Low Bill");
		else if(units<=300)
		    System.out.println("Medium Bill");
		else
		    System.out.println("High Bill");
	
	}

}

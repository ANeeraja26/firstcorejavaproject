package com.exceptionhandling;

public class TestDemo26 {
	
	static void welcome() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("welcome called");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");
		
		welcome();
	}

}

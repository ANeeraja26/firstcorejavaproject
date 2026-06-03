package com.operators;

public class TestTernayOpDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a = 10;
		int b = 100;
		int c = 1000;
		
		int max=(a>b)?((a>c)?a:c):((b>c?b:c));
			System.out.println(max);
	}

}

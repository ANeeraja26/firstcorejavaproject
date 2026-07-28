package com.strlinghandling;

public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String name = "Java";
		String name1 = "java";
		
		System.out.println(name.contentEquals(name1));
		
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
	}

}

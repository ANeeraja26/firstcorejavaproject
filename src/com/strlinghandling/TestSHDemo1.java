package com.strlinghandling;

public class TestSHDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		// 1 object 
		String s="Neeraja";
		
		// 0 object
		String s1="Neeraja";
		
		// 0 object 
		String s2="Neeraja";
		
		String s3="Neeraja";
		
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("********************************************");

		
		s2="Spring";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("main method ended");


	}

}

package com.strlinghandling;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String s1=new String();
		System.out.println(s1);// empty line
		
		String s2=new String("Neeraja");// 2 objects
		
		String s3="Neeraja";
		String s4=new String("Neeraja");
		
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
		
		System.out.println("main method ended");
	}

}

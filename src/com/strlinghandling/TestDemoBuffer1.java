package com.strlinghandling;

public class TestDemoBuffer1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String s1=new String("Neeraja");
		System.out.println(s1);
		
		// string is immutable
		String s2="java";
		s2.concat("Neeraja");
		System.out.println(s2);
		
		
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb);
		sb.append("vcube");
		sb.append("jntu");
		sb.append("kphb");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Java");
		sb1.append("vcube");
		System.out.println(sb1);
		
		
		
		System.out.println("main method ended");

	}

}

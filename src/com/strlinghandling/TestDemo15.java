package com.strlinghandling;

public class TestDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		
		String str="Neeraja Java";
		System.out.println(str.replace("java", "spring"));
		System.out.println(str.replace('a','A'));
		
		
		String Str1="Vcube java 500090";
		System.out.println(Str1.replaceAll("\\d","X"));
	}

}

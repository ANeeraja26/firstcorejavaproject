package com.exceptionhandling;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String name="Neeraja";
		System.out.println(name.length());//7
		
		String name1="";
		System.out.println(name1.length());//0
		
		String name2="Null";
		System.out.println(name2.length());//4
		
				
		try {
			String name3=null;
			System.out.println(name3.length());
			
		}catch(NullPointerException n) {
			n.printStackTrace();
			
		}
		
		System.out.println("main method ended");
	}

}

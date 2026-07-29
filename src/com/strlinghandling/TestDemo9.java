package com.strlinghandling;

public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String str="";//empty
		String str1=null;//null
		String str2=" ";// empty space
		
		String str3=new String();
		
		
		System.out.println(str.isEmpty());//true
		System.out.println(str.isBlank());//true
		
		System.out.println(str2.isEmpty());//false
		System.out.println(str2.isBlank());// true
		
		System.out.println(str3.isEmpty());// true
		System.out.println(str3.isBlank());// true
		
	// 	System.out.println(str1.isEmpty());//NPE
	// 	System.out.println(str1.isBlank());//NPE
		
		
	}

}

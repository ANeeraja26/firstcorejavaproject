package com.strlinghandling;

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String str="Java is simple";
		System.out.println(str.codePointAt(1));
		
		System.out.println(str.codePointBefore(1));
		
		System.out.println(str.codePointCount(1, 6));
		
		
		
		String str1="Neeru";
		String str2="Neeraja";
		System.out.println(str1.compareTo(str2));
		
		
		String str3="Java";
		String str4="java";
		System.out.println(str3.compareTo(str4));
		
		String str5="Hello";
		String str6="hello";
		System.out.println(str5.compareTo(str6));
		System.out.println(str5.compareToIgnoreCase(str6));//0
		
		String str7="Neeraja";  // 7
		String str8="Nee";    // 3 ------->  7-3---------------- 
		System.out.println(str7.compareTo(str8)); // 4
		
		int a=10;
		String name="Neeraja";
		System.out.println(name.concat("10"));
		System.out.println(name+10);
		
		
		String name1="Neeraja";
		String name2="java";
		
		name1.concat(name2);
		System.out.println(name1);// Neeraja
		
		System.out.println(name1.concat(name2));//Neerajaajava
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

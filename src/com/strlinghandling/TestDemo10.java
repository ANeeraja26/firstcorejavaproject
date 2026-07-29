package com.strlinghandling;

public class TestDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String s1="Java";//SCP
		String s2=new String("Java");//Heap
		
		System.out.println(s1==s2);//false
		
		s2=s2.intern();
		System.out.println(s1==s2);//true
		
		String s3="Neeraja";
		String s4=new String("Neeraja");
		
		System.out.println(s3==s4);//false
		s3=s3.intern();
		System.out.println(s3==s4);//false
		
	}

}

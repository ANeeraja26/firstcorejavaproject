package com.strlinghandling;

public class TestDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String s1="Java is simple in Vcube at kukatpally JNTU";
		
		System.out.println(s1.indexOf('a')); // 1
		
		System.out.println(s1.lastIndexOf('a'));// 33
		
		
		// 2nd a  index
		System.out.println(s1.indexOf('a',s1.indexOf('a')+1));//3
		
		// 3rd a index
		System.out.println(s1.indexOf('a',s1.indexOf('a',s1.indexOf('a')+1)+1));//24
		
		
		System.out.println(s1.indexOf("in")); // 15
		
		System.out.println(s1.indexOf("z"));//-1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

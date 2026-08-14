package com.strlinghandling;

public class TestDemobuffer2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		
		StringBuffer sb1=new StringBuffer("java");
		System.out.println(sb1.capacity());//20
		
		StringBuffer sb2=new StringBuffer("Neeraja");
		System.out.println(sb2.capacity());//23
		
		StringBuffer sb3=new StringBuffer();
		sb3.append("Neeraja");
		System.out.println(sb3.capacity());//16
		
		
		StringBuffer sb4=new StringBuffer();
		sb4.append("NeerajaNeerajaN");//current capacity*2+2---------32
		System.out.println(sb4.capacity());
		
		
		StringBuffer sb5=new StringBuffer();
		sb5.append("NeerajaNeerajaNeerajaNeeraja");
		System.out.println(sb5.capacity());//34
		
		
		StringBuffer sb6=new StringBuffer();
		sb6.append("NeerajaNeerajaNeerajaNeeraja");
		sb6.append("Neeraja");
		System.out.println(sb6.capacity());//70
		
		
		
		

		
		
		
		
		
		


		
		


			
	}

}

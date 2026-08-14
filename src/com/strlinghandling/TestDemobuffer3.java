package com.strlinghandling;

public class TestDemobuffer3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		StringBuffer sb1=new StringBuffer("Neeraja");
		
		System.out.println(sb1.delete(2, 7));//ne
		
		
		StringBuffer sb2=new StringBuffer();
		sb2.ensureCapacity(17);
		System.out.println(sb2.capacity());//34
		
		char[]ch=new char[10];
		StringBuffer sb3=new StringBuffer("java is simple");
		sb3.getChars(0, 4, ch, 0);
		System.out.println(ch);//java

		
		
		
		
	}

}

package com.languagefundamentals;

public class TestDataTypesDemo1 {
	
	byte b=127;
	byte b1=(byte)130;
	
	short s=b1;
	short s1=32767;
	
	int i = s1;
	int i1 = 2147483647;
	
	long l = 2147483647;
	long l1 = 9223372036854775807L;
	
	float f = 10;
	float f2 = 567.47079875559087643F;
	
	
	double d = 567.47079875559087643D;
	
	char c='A';
	char c2 = 70;
	
	boolean boo = true;
	

	public static void main(String[] args) {
		
		TestDataTypesDemo1 t=new TestDataTypesDemo1();
		System.out.println("main method Started");
		
		System.out.println("byte value:"+t.b);
		System.out.println("byte value:"+t.b1);
		
		System.out.println("short value:"+t.s);
		System.out.println("short value:"+t.s1);
		
		System.out.println("int value:"+t.i);
		System.out.println("int value:"+t.i1);
		
		System.out.println("long value:"+t.l);
		System.out.println("long value:"+t.l1);
		
		
		System.out.println("float value:"+t.f);
		System.out.println("double value:"+t.f2);
		

		System.out.println("char value:"+t.c);
		System.out.println("char value:"+t.c2);
		
		System.out.println("boolean value:"+t.boo);
		
		System.out.println("main method ended");
		
		

	}

}

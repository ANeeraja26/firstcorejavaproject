package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog{
	
	
}


public class TestDataTypesDemo2 {
	
	Integer i1 =100;
	int i2 = i1;
	Float f1;
	Double d1;
	
	String s = "Neeraja";
	
	
	
	BigInteger b1 = new BigInteger("9876543210987654321");
	BigInteger b2 = new BigInteger("9876543210987654321");
	BigDecimal b3 = new BigDecimal("123456789012345678901234567890");
	
	Dog d;
	
	

	public static void main(String[] args) {
    System.out.println("main method started");
    
    
    TestDataTypesDemo2 t = new TestDataTypesDemo2();
    System.out.println(t.i1);
    System.out.println(t.f1);
    System.out.println(t.d1);
    
    
    System.out.println(t.b1.add(t.b2));
    
    
    System.out.println(t.d);
    
    
    
	}

}

package com.task;

import java.math.BigInteger;
import java.math.BigDecimal;




public class TestDemo3 {
	BigInteger b1=new BigInteger("9876543210987654321");
	BigInteger b2=new BigInteger("9876543210987654320");
	BigDecimal b3=new BigDecimal("54987654332.457638");
	BigDecimal b4=new BigDecimal("987654321.765432");

	
	
	


	public static void main(String[] args) {
		
		TestDemo3 t=new TestDemo3();
		System.out.println(t.b1.add(t.b2));
		System.out.println(t.b1.subtract(t.b2));
		System.out.println(t.b1.multiply(t.b2));
		System.out.println(t.b1.divide(t.b2));
		System.out.println(t.b1.mod(t.b2));
		System.out.println(t.b3.divide(t.b4, 2,BigDecimal.ROUND_HALF_UP));
		

	}

}

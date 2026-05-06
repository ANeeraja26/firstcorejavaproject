package com.task;

public class TestDemo2 {
	
	static int acc_no =101;
	{
		
		acc_no ++;
		
	}
	
	String name;
	double acc_bal;
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started"); 
		System.out.println("--------account 1 detalis-------");
		TestDemo2 b = new TestDemo2();
		acc_no=101;
		b.name="neeraja";
		b.acc_bal=25000;
		System.out.println(acc_no);
		System.out.println(b.name);
		System.out.println(b.acc_bal);
		
		System.out.println("---------account 2 detalis-------");
		TestDemo2 b1=new TestDemo2();
	
		b1.name="Ram";
		b1.acc_bal=35000;
		System.out.println(acc_no);
		System.out.println(b1.name);
		System.out.println(b1.acc_bal);
		
		
		System.out.println("---------account 3detalis-------");
		TestDemo2 b2=new TestDemo2();
	
		b2.name="neeru";
		b2.acc_bal=45000;
		System.out.println(acc_no);
		System.out.println(b2.name);
		System.out.println(b2.acc_bal);
		
		System.out.println("main method ended");

		
		
		
			
		
		
		

	}

}

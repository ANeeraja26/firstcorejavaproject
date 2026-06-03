package com.operators;


// Unary operators + - ++ --
public class TestUnaryOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a=5;
		int b=6;
		 
		System.out.println(-a);// -5
		System.out.println(+b);//6
		
		System.out.println("********Post increment**************");
		System.out.println(a++);//5-----a++(a+1)=6
		System.out.println(a++);//6
		
		System.out.println("******** pre decrement***********");
		System.out.println(--a);//6
		System.out.println(--b);//5
		
		System.out.println("************* pre increment*******");
		System.out.println(++a);//7
		
		System.out.println("************post drecement**********");
		System.out.println(a--);//7
		System.out.println(b--);//5
		
		
		System.out.println("A value is:"+a);//6
		System.out.println("A value is:"+b);//4
		
		
	}

}

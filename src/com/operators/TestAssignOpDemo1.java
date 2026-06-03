package com.operators;

//Assignment Operators = += -= *= /= %=
public class TestAssignOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int x = 10;
		int result = 0;

		result=result+x;
		System.out.println(result);//10
		
		
		result+=4.5;
		System.out.println(result);//14
		
		
		result-=5.5;
		System.out.println(result);//8
		
		result*=4.5;
		System.out.println(result);//36
		
		result/=2.5;
		System.out.println(result);//14
		
		result%=2.5;
		System.out.println(result);//1
		
		
	}

}

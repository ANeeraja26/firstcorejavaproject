package com.languagefundamentals.methods;

public class TestDemo5 {
	
	 static int addition() {
		int sum=500+200;
		return sum;
		
	}
	 static int Subtraction() {
		int diff=350-200;
		return diff;
		
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		int sum=addition();
		int diff=Subtraction();
		
		System.out.println("sum of 2 numbers is:"+sum);
		System.out.println("diff of 2 numbers is:"+diff);
		

	}

}

package com.task;

public class NestedTernary {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a=5;
		int b=10;
		int c=4;
		
		
		int greatest = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);
		
		System.out.println("Greatest number = " + greatest);
	}

}

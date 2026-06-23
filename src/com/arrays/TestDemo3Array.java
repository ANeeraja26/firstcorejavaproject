package com.arrays;

public class TestDemo3Array {

	public static void main(String[] args) {
		System.out.println("main method started");

		String[] names = new String[5];
		
		names[0]="neeraja";
		names[1]="neeru";
		names[2]="neeraj";
		names[3]="neeraja";
		names[4]="neeru";
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			
		}

	}

}

package com.operators;

// comparison operators: == < > <= >= !=  result:boolean 
//operators checks the values when the data is primitive
//== operators checks the address when it is object data types.
public class TestComparisonOpDemo {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a == b);
		System.out.println(a == c);

		// String literals->SCP:storing the same address

		String s1 = "Neeraja";
		String s2 = "Neeraja";

		System.out.println(s1 == s2);// true

		String s3 = new String("java");// Heap new object
		String s4 = new String("java");// heap new object

		System.out.println(s3 == s4);//
		System.out.println(s3.equals(s4));

		String s5 = "Neeraja";
		String s6 = new String("Neeraja");
		System.out.println(s5 == s6);

	}

}

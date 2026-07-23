package com.oops.methodoverloading;

public class TestMOLDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestMOLDemo1 t=new TestMOLDemo1();

		byte b = 10;
		short s = 5645;
		int count = 3000;
		long ph = 9392436650L;
		float height = 5.8F;
		double weight = 77;
		char c = 'A';
		String name = "Neeraja";
		boolean status = false;
		char[] ch = { 'A', 'B' };

		System.out.println(b);
		System.out.println(s);
		System.out.println(count);
		System.out.println(ph);

		System.out.println(height);
		System.out.println(weight);
		System.out.println(c);
		System.out.println(name);
		System.out.println(status);
		System.out.println(ch);
		System.out.println();
		System.out.println(t);
	}

}

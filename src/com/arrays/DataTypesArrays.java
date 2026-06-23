package com.arrays;

public class DataTypesArrays {

	public static void main(String[] args) {

		byte[] b = { 1, 2, 3 };
		short[] s = { 100, 200, 300 };
		int[] i = { 21, 44, 35 };
		long[] l = { 1000L, 2000L, 3000L };
		float[] f = { 1.1f, 2.2f, 3.3f };
		double[] d = { 10.5, 20.5, 30.5 };
		char[] c = { 'A', 'B', 'C' };

		System.out.println("Byte Array:");
		for (byte x : b)
			System.out.println(x);

		System.out.println("Short Array:");
		for (short x : s)
			System.out.println(x);
		
		System.out.println("int Array:");
		for (int x : i)
			System.out.println(x);

		System.out.println("Long Array:");
		for (long x : l)
			System.out.println(x);

		System.out.println("Float Array:");
		for (float x : f)
			System.out.println(x);

		System.out.println("Double Array:");
		for (double x : d)
			System.out.println(x);

		System.out.println("Char Array:");
		for (char x : c)
			System.out.println(x);
	}

}

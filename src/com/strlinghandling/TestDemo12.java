package com.strlinghandling;

public class TestDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String s1 = "Java";

		byte[] arrBytes = s1.getBytes();

		// for(byte b:arrBytes) {
		// System.out.println((char)b);

		// }

		for (int i = arrBytes.length - 1; i >= 0; i--) {
			System.out.println((char)arrBytes[1]+"");

		}
	}

}

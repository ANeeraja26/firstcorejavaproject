package com.task;

public class BitwiseOp3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a = 12; // Binary: 1100
        int b = 5;  // Binary: 0101

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Bitwise AND
        System.out.println("a & b = " + (a & b));

        // Bitwise OR
        System.out.println("a | b = " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));

        // Bitwise NOT
        System.out.println("~a = " + (~a));

        // Left Shift
        System.out.println("a << 2 = " + (a << 2));

        // Right Shift
        System.out.println("a >> 2 = " + (a >> 2));

	}

}

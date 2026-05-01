package com.javaintroduction;

public class TestDemo11 {
	static void main1() {
		System.out.println("static method called");
		TestDemo11 t=new TestDemo11();
		t.main();
		t.main2();
		
	}
	
	void main() {
		System.out.println("instance method called");
	}
 void main2() {
	 System.out.println("instance method2 called");
 }
 static {
	 main1();
 }

	public static void main(String[] args) {
		System.out.println("main method called");
		

	}

}

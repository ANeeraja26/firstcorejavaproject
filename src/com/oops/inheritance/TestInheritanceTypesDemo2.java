package com.oops.inheritance;

class TestA1{
	void method1() {
		System.out.println("method1 called test1");
	}
	
}

class TestA2 extends TestA1{
	void method2() {
		System.out.println("method2 called test2");
	}

	
}

class TestA3 extends TestA1{
	void method3() {
		System.out.println("method3 called test3");
	}

	
}


public class TestInheritanceTypesDemo2 {

	public static void main(String[] args) {
		
		TestA2 a2=new TestA2();
		a2.method1();
		a2.method2();
		
		
		TestA3 a3=new TestA3();
		a3.method1();
		a3.method3();

	}

}

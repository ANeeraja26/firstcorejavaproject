package com.oops.abstraction;

interface TestA1 {
	void method1();

	void method2();
	
	default void hello() {
		System.out.println("hello from TestA1");
	}

}

interface TestB1 {

	void method2();

	void method3();

}

interface TestC1 extends TestA1, TestB1 {

}

class TestImple implements TestC1 {

	@Override
	public void method1() {
		System.out.println("method1 called form TestImple");
	}

	@Override
	public void method2() {
		System.out.println("method2 called form TestImple");

	}

	@Override
	public void method3() {
		System.out.println("method3 called form TestImple");

	}

}

public class TestAbsDemo1 {

	public static void main(String[] args) {
		
		TestImple t=new TestImple();
		t.method1();
		t.method2();
		t.method3();
		

	}

}

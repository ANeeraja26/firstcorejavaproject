
package com.oops.inheritance;

class A {
	void method1() {
		System.out.println("method1 called form A");
	}
}

class B extends A {
	void method2() {
		System.out.println("method2 called from B");
	}
}

class C extends B {
	void method3() {
		System.out.println("method3 called from B");
	}
}

public class TestInheritanceTypesDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		C c = new C();
		c.method1();
		c.method2();
		c.method3();

	}

}

package com.oops.inheritance;

class TestA{
	void dispaly() {
		System.out.println("dispaly method called TestA");
	}
	
}

class TestB extends TestA{
	@Override
	void dispaly() {
		System.out.println("dispaly method called TestB");
	}
	
}

class TestC extends TestA{
	@Override
	void dispaly() {
		System.out.println("dispaly method called TestC");
	}
	
}


public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
	}

}

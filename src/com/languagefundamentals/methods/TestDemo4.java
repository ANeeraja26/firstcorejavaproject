package com.languagefundamentals.methods;

public class TestDemo4 {
	
	double balance=10000.00;
	void Deposit( double amount ) {
		System.out.println("deposit method called");
		balance=balance+amount;
			
	}
	void withdraw( double amount ) {
		System.out.println("withdraw method called");
		balance=balance-amount;
	}
	
	
	void getBalance() {
		System.out.println(balance);
	}
	
	
	
		


	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo4 t=new TestDemo4();
		t.Deposit(4000);
		t.withdraw(5000);
		t.getBalance();
		
		System.out.println("main method ended");

	}

}

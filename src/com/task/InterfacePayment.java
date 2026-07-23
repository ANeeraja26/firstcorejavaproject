package com.task;

interface Payment{
	void pay(double amount);
}

class CreaditCard implements Payment{
	public void pay(double amount) {
		System.out.println("credit card payment:"+amount);
		
	}
}

class UPI implements Payment{
	public void pay(double amount) {
		System.out.println("UPI payment:"+amount);
		
	}
}

class Cash implements Payment{
	public void pay(double amount) {
		System.out.println("Cash payment:"+amount);
		
	}
}


public class InterfacePayment {

	public static void main(String[] args) {
		CreaditCard c1=new CreaditCard();
		UPI u1=new UPI();
		Cash c2=new Cash();
		
		c1.pay(500);
		u1.pay(400);
		c2.pay(100);
		
		
	}

}

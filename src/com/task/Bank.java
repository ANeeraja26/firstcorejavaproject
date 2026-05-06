package com.task;

public class Bank {
	
	static int acc_no=101;

	String name;
	double balance;{
		acc_no++;
	}
	
	void Display() {
		System.out.println("Account Number:"+ acc_no);
		System.out.println("name:"+name);
		System.out.println("Balance:"+balance);
		System.out.println("--------------------");
		
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Bank detalis 1");
		Bank A=new Bank();
		A.name="Neeraja";
		A.balance=5000000;
		A.Display();
		System.out.println("Bank detalis 2");
		Bank B=new Bank();
		B.name="Neeru";
		B.balance=6000000;
		B.Display();
		System.out.println("Bank detalis 3");
		Bank C=new Bank();
		C.name="Ram";
		C.balance=8000000;
		C.Display();

		

		
		
		

	}

}

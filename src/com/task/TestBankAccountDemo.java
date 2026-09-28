package com.task;

class BankAccount extends Thread {

	int balance = 10000;

	synchronized void withdraw(String customerName, int amount) {
		
		System.out.println(customerName + " withdraw " + amount);

		while (amount > balance) {
            System.out.println(customerName + " is waiting ");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
		
		balance=balance-amount;
		System.out.println(customerName + " withdrew " + amount);
        System.out.println("Remaining Balance: ₹" + balance);
		System.out.println();
		
        notify();



		}

	}



class Customers extends Thread {
	BankAccount account;
	String customerName;
	int amount;

	public Customers(BankAccount account, String customerName, int amount) {
		super();
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}

	@Override
	public void run() {

		account.withdraw(customerName, amount);

	}

}

public class TestBankAccountDemo {

	public static void main(String[] args) {

		BankAccount bc = new BankAccount();

		Customers c1 = new Customers(bc, "Customer 1", 7000);
		Customers c2 = new Customers(bc, "Customer 2", 5000);

		c1.start();
		c2.start();

	}

}

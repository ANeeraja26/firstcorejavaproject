package com.multithreading;

class BookMyShow {
	int total_tickets = 10;

	synchronized void BookMyTickets(String name, int tickets) {

		if (tickets <= total_tickets) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

			total_tickets = total_tickets - tickets;

			System.out.println("your ticket booked sucessfully : " + name);
			System.out.println("your total booked tickets are : " + tickets);
			System.out.println("available tickets form book my show :" + total_tickets);

		} else {
			System.err.println("tickets has be sold out ");
			System.err.println("available tickets are  :" + total_tickets);
		}
	}

}

    class Customer extends Thread {

	BookMyShow bms;
	String CustomerName;
	int tickets;

	public Customer(BookMyShow bms, String customerName, int tickets) {
		super();
		this.bms = bms;
		CustomerName = customerName;
		this.tickets = tickets;
	}

	@Override
	public void run() {
		bms.BookMyTickets(CustomerName, tickets);

	}

}

public class TestBookMyShowDemo {

	public static void main(String[] args) {
		BookMyShow bms = new BookMyShow();

		Customer neeraja = new Customer(bms, "Neeraja", 6);
		neeraja.start();

		Customer Ram = new Customer(bms, "Ram", 6);
		Ram.start();
		
		Customer Neeru = new Customer(bms, "Neeru", 6);
		Neeru.start();


	}

}

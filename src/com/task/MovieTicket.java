package com.task;

public class MovieTicket {
	
	static String theaterName="Sreeramulu";
    int customerId;
    String customerName;
    int tickets;
    
    void Calculate() {
    	int ticketprice=150;
    	int totalamount=(ticketprice)*(tickets);
    	
    	System.out.println("theaterName:"+theaterName);
    	System.out.println("customerId:"+customerId);
    	System.out.println("customerName:"+customerName);
    	System.out.println("tickets:"+tickets);
    	
    }

	public static void main(String[] args) {
		System.out.println("main method started");
 
		MovieTicket m1=new MovieTicket();
		m1.customerName="Neeraja";
		m1.customerId=100;
		m1.tickets=2;
		m1.Calculate();
		
	
		
	}

}
